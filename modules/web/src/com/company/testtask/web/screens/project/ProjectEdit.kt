package com.company.testtask.web.screens.project

import com.company.testtask.entity.Employee
import com.haulmont.cuba.gui.screen.*
import com.company.testtask.entity.Project
import com.haulmont.cuba.gui.UiComponents
import com.haulmont.cuba.gui.components.CheckBox
import com.haulmont.cuba.gui.components.Component
import org.slf4j.Logger
import javax.inject.Inject

@UiController("Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
@LoadDataBeforeShow
class ProjectEdit : StandardEditor<Project>(){

    @Inject
    private lateinit var log: Logger

    @Inject
    private lateinit var uiComponents: UiComponents;


    @Install(to = "employeesTable.existInProject", subject = "columnGenerator")
    private fun employeesTableExistInProjectColumnGenerator(employee: Employee?): Component {
        var employees: MutableList<Employee>? = editedEntity.employees
        var isExist: CheckBox = uiComponents.create(CheckBox::class.java)

        if (employees != null && employees.contains(employee)) {
             isExist.isEditable = true;
             isExist.value = true;
        }
        else{
            isExist.isEditable = true
            isExist.value = false
        }

        isExist.addValueChangeListener { event ->
            log.info(event.value.toString())

            if (event.value == false) {
                editedEntity.employees?.remove(employee)
            } else {
                if (employee != null) {
                    editedEntity.employees?.add(employee)
                }
            }}

        return isExist;
    }
}