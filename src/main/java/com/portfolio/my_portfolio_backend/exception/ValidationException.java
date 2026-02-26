package com.portfolio.my_portfolio_backend.exception;

import org.springframework.validation.BindingResult;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidationException extends RuntimeException {

    private final BindingResult bindingResult;

    public ValidationException(BindingResult bindingResult) {
        super("Error de validación, se encontraron errores: " + bindingResult.getErrorCount());
        this.bindingResult = bindingResult;
    }
}
