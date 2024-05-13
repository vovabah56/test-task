package com.company.testtask.web.screens.project

import com.haulmont.cuba.gui.screen.*
import com.company.testtask.entity.Project
import com.company.testtask.service.ProjectService
import com.haulmont.cuba.gui.UiComponents
import com.haulmont.cuba.gui.components.GroupTable
import com.haulmont.cuba.gui.components.Label
import javax.inject.Inject

@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
@LoadDataBeforeShow
class ProjectBrowse : StandardLookup<Project>(){

    @Inject
    private lateinit var projectsTable: GroupTable<Project>;

    @Inject
    private lateinit var uiComponents: UiComponents;

    @Inject
    lateinit var projectService: ProjectService

    @Subscribe
    protected fun onInit(event: InitEvent) {
        projectsTable.addGeneratedColumn("Count of employees") { project ->
            val label = uiComponents.create(Label::class.java)
            label.value = projectService.calculateCountEmployees(project)
            label
        }
    }
}