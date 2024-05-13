package com.company.testtask.entity

import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "EMPLOYEE")
@javax.persistence.Entity(name = "Employee")
open class Employee : StandardEntity() {
    companion object {
        private const val serialVersionUID = 5345192076280344034L
    }


    @NotNull
    @Column(name = "NAME", nullable = false)
    var name: String? = null
        get() = field
        set(value) {
            field = value
        }

    @JoinTable(name = "PROJECT_EMPLOYEE",
        joinColumns = arrayOf(JoinColumn(name = "employee_id")),
        inverseJoinColumns = arrayOf(JoinColumn(name = "project_id"))
    )
    @ManyToMany(mappedBy = "")
    var projects: MutableList<Project> = mutableListOf()
        set(value) {
            field = value
        }
        get() = field
}