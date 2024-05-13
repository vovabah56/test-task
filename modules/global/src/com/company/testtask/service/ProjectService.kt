package com.company.testtask.service

import com.company.testtask.entity.Project

interface ProjectService {
    companion object {
        const val NAME = "testtask_ProjectService"
    }
     fun calculateCountEmployees(project: Project): Int{
        return project.employees?.size ?: 0
    }

}