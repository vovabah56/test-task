create table PROJECT_EMPLOYEE (
    project_id varchar(36) not null,
    employee_id varchar(36) not null,
    primary key (project_id, employee_id)
);
