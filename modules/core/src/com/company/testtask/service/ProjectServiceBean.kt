package com.company.testtask.service

import com.company.testtask.entity.Project
import org.springframework.stereotype.Service

@Service(ProjectService.NAME)
class ProjectServiceBean : ProjectService{
    public override fun calculateCountEmployees(project: Project): Int{
        return project.employees?.size ?: 0
    }
}