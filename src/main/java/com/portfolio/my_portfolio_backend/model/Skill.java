package com.portfolio.my_portfolio_backend.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    private Long id;
    
    @NotBlank(message = "El nombre de la habilidad no puede estar vacío")
    private String name;

    @NotBlank(message = "El porcentaje de nivel no puede estar vacío")
    @Min(value = 0, message = "El porcentaje de nivel no puede ser negativo")
    @Max(value = 100, message = "El porcentaje de nivel no puede ser mayor a 100")
    private Integer levelPercentage;
    
    @NotBlank(message = "La clase del icono no puede estar vacía")
    private String iconClass;
    
    private Long personalInfoId;
}
