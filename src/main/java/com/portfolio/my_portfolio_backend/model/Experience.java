package com.portfolio.my_portfolio_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
    private Long id;

    @NotBlank(message = "El nombre del puesto es obligatorio")
    private String jobTitle;
    
    @NotBlank(message = "El nombre de la empresa es obligatorio")
    private String companyName;
    
    @NotBlank(message = "La fecha de inicio es obligatoria")
    @Past(message = "La fecha de inicio debe ser en el pasado")
    private LocalDate startDate;
    
    @NotBlank(message = "La fecha de finalizacion es obligatoria")
    private LocalDate endDate;
    
    @NotBlank(message = "La descripcion es obligatoria")
    private String description;
    
    private Long personalInfoId;
}
