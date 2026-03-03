package com.portfolio.my_portfolio_backend.service;

import java.util.List;
import java.util.Optional;

import com.portfolio.my_portfolio_backend.model.Project;

public interface IProjectService {
    List<Project> findAll();
    Optional<Project> findById(Long id);
    Project save(Project project);
    void deleteById(Long id);
}
