package com.portfolio.my_portfolio_backend.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkillDto {

    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 100, message = "El nombre debe tener entre 2 y 100 caracteres")
    private String name;

    @NotNull(message = "El nivel es obligatorio")
    @Min(value = 0, message = "El nivel debe ser mayor o igual a 0")
    @Max(value = 100, message = "El nivel debe ser menor o igual a 100")
    private Integer levelPercentage;

    @NotBlank(message = "El icono es obligatorio")
    private String iconClass;

    @NotNull(message = "El ID de la informacion no puede ser nulo")
    private Long personalInfoId;
}
