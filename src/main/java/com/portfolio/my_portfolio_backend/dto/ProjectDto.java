package com.portfolio.my_portfolio_backend.dto;

import org.hibernate.validator.constraints.URL;

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
public class ProjectDto {

    private Long id;

    @NotBlank(message = "El titulo es obligatorio")
    @Size(min = 2, max = 255, message = "El titulo debe tener entre 2 y 255 caracteres")
    private String title;

    @NotBlank(message = "La descripcion es obligatoria")
    @Size(min = 10, message = "La descripcion debe tener al menos 10 caracteres")
    private String description;

    @URL(message = "La URL de la imagen no tiene un formato valido")
    private String imageUrl;

    @URL(message = "La URL del proyecto no tiene un formato valido")
    private String projectUrl;

    @NotNull(message = "El ID de la informacion no puede ser nulo")
    @Min(value = 1, message = "El ID de la informacion debe ser mayor a 0")
    private Long personalInfoId;
}
