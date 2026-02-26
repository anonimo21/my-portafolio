package com.portfolio.my_portfolio_backend.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDto {
    private Long id;

    @NotBlank(message = "El titulo es obligatorio")
    private String degree;

    @NotBlank(message = "La institucion es obligatoria")
    private String institution;

    @NotNull(message = "La fecha de inicio es obligatoria")
    @Past(message = "La fecha de inicio debe ser en el pasado")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @NotNull(message = "La fecha de finalizacion es obligatoria")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    @NotBlank(message = "La descripcion es obligatoria")
    private String description;

    @NotNull(message = "El ID de la informacion no puede ser nulo")
    @Min(value = 1, message = "El ID de la informacion debe ser mayor a 0")
    private Long personalInfoId;
}
