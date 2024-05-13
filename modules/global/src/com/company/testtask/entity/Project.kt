package com.company.testtask.entity

import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "PROJECT")
@javax.persistence.Entity(name = "Project")
open class Project : StandardEntity() {
    companion object {
        private const val serialVersionUID = -2458647152418306857L
    }

    @NotNull
    @Column(name = "NAME", nullable = false)
    var name: String? = null
        get() = field
        set(value) {
            field = value
        }

    @JoinTable(
        name = "PROJECT_EMPLOYEE",
        joinColumns = [JoinColumn(name = "project_id")],
        inverseJoinColumns = [JoinColumn(name = "employee_id")]
    )
    @ManyToMany
    var employees: MutableList<Employee>? = mutableListOf()
        get() = field
        set(value) {
            field = value
        }
}