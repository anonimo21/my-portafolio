package com.portfolio.my_portfolio_backend.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = "admin";
        String encodedPassword = encoder.encode(password);
        System.out.println("encodedPassword: " + encodedPassword);
    }
}
