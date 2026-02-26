package com.portfolio.my_portfolio_backend.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portfolio.my_portfolio_backend.dto.EducationDto;
import com.portfolio.my_portfolio_backend.mapper.EducationMapper;
import com.portfolio.my_portfolio_backend.model.Education;
import com.portfolio.my_portfolio_backend.service.IEducationService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/education")
@RequiredArgsConstructor
public class EducationController {
    
    private final IEducationService educationService;

    @GetMapping
    public String listEducation(Model model) {
        List<Education> educations = educationService.findAll();
        List<EducationDto> educationDtos = educations.stream()
                .map(EducationMapper::toDto)
                .toList();
        model.addAttribute("educations", educationDtos);
        return "education/list-education";
    }

    @GetMapping("/new-education")
    public String showForm(Model model) {
        EducationDto newEducationDto = new EducationDto();
        newEducationDto.setStartDate(LocalDate.now());
        model.addAttribute("educationDto", newEducationDto);
        return "education/form-education";
    }

    @PostMapping("/save")
    public String saveExperience(
            @Valid @ModelAttribute("educationDto") EducationDto educationDto,
            BindingResult result,
            RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "education/form-education";
        }
        try {
            Education education = EducationMapper.toEntity(educationDto);
            educationService.save(education);
            redirectAttributes.addFlashAttribute("message", "Educacion guardada correctamente");
            return "redirect:/education";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error al guardar la educacion: " + e.getMessage());
            return "redirect:/education";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Education> educationOptional = educationService.findById(id);
        if (educationOptional.isPresent()) {
            EducationDto educationDto = EducationMapper.toDto(educationOptional.get());
            model.addAttribute("educationDto", educationDto);
            return "education/form-education";
        } else {
            model.addAttribute("errorMessage", "No se encontro la experiencia con id: " + id);
            return "redirect:/education";
        }
    }

    @GetMapping("/personal/{personalInfoId}")
    public String listEducationByPersonalInfoId(@PathVariable Long personalInfoId, Model model) {
        List<Education> educations = educationService.findEducationByPersonalInfoId(personalInfoId);
        List<EducationDto> educationDtos = educations.stream().map(EducationMapper::toDto).toList();
        model.addAttribute("educationList", educationDtos);
        return "education/list-education";
    }

    @PostMapping("/delete/{id}")
    public String deleteEducation(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            educationService.deleteById(id);
            redirectAttributes.addFlashAttribute("message", "Educacion eliminada correctamente");
            return "redirect:/education";   
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "No se pudo eliminar la educacion con id: " + id);
            return "redirect:/education";
        }
    }

    

}
