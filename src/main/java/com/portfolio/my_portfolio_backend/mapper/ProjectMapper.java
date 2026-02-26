package com.portfolio.my_portfolio_backend.mapper;

import com.portfolio.my_portfolio_backend.dto.ProjectDto;
import com.portfolio.my_portfolio_backend.model.Project;

public class ProjectMapper {

        public static Project toEntity(ProjectDto dto) {
        if (dto == null) {
            return null;
        }
        Project entity = new Project();

        entity.setId(dto.getId());
        entity.setTitle(dto.getTitle());
        entity.setDescription(dto.getDescription());
        entity.setImageUrl(dto.getImageUrl());
        entity.setProjectUrl(dto.getProjectUrl());
        entity.setPersonalInfoId(dto.getPersonalInfoId());

        return entity;
    }

    public static ProjectDto toDto(Project project) {
        if (project == null) {
            return null;
        }
        ProjectDto dto = new ProjectDto();

        dto.setId(project.getId());
        dto.setTitle(project.getTitle());
        dto.setDescription(project.getDescription());
        dto.setImageUrl(project.getImageUrl());
        dto.setProjectUrl(project.getProjectUrl());
        dto.setPersonalInfoId(project.getPersonalInfoId());

        return dto;
    }
}
