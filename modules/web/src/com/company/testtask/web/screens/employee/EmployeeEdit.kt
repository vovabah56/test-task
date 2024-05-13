package com.company.testtask.web.screens.employee

import com.haulmont.cuba.gui.screen.*
import com.company.testtask.entity.Employee

@UiController("Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
class EmployeeEdit : StandardEditor<Employee>()