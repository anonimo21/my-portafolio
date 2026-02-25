package com.portfolio.my_portfolio_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {
    private Long id;

    @NotBlank(message = "El nombre del titulo es obligatorio")
    private String degree;
    
    @NotBlank(message = "El nombre de la institucion es obligatorio")
    private String institution;
    
    @NotBlank(message = "La fecha de inicio es obligatoria")
    @PastOrPresent(message = "La fecha de inicio no puede ser futura")
    private LocalDate startDate;
    
    @NotBlank(message = "La fecha de finalizacion es obligatoria")
    @PastOrPresent(message = "La fecha de finalizacion no puede ser futura")
    private LocalDate endDate;
    
    @NotBlank(message = "La descripcion es obligatoria")
    private String description;
    
    @NotBlank(message = "Personal info ID is required")
    private Long personalInfoId;
}
