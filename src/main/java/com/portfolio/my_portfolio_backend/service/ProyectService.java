package com.portfolio.my_portfolio_backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.my_portfolio_backend.model.Project;
import com.portfolio.my_portfolio_backend.repository.IProjectRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProyectService implements IProjectService {

    private final IProjectRepository projectRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    @Transactional
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        projectRepository.deleteById(id);
    }

}   
