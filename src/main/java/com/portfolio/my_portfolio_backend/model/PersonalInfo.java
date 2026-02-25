package com.portfolio.my_portfolio_backend.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalInfo {
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    private String firstName;

    @NotBlank(message = "El apellido no puede estar vacío")
    private String lastName;
    
    @NotBlank(message = "El título no puede estar vacío")
    private String title;
    
    @NotBlank(message = "La descripción del perfil no puede estar vacía")
    private String profileDescription;
    
    @NotBlank(message = "La URL de la imagen de perfil no puede estar vacía")
    private String profileImageUrl;
    
    @Min(value = 0, message = "Los años de experiencia no pueden ser negativos")
    private Integer yearsOfExperience;
    
    @Email(message = "El correo electrónico debe ser válido")
    private String email;
    
    @NotBlank(message = "El número de teléfono no puede estar vacío")
    private String phone;
    
    @NotBlank(message = "La dirección no puede estar vacía")
    private String address;
    
    @NotBlank(message = "La URL de LinkedIn no puede estar vacía")
    private String linkedinUrl;
    
    @NotBlank(message = "La URL de GitHub no puede estar vacía")
    private String githubUrl;
}
