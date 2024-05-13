package com.company.testtask.web.screens.employee

import com.haulmont.cuba.gui.screen.*
import com.company.testtask.entity.Employee

@UiController("Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
class EmployeeBrowse : StandardLookup<Employee>()