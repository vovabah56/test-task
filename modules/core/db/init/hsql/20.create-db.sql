-- begin PROJECT_EMPLOYEE
alter table PROJECT_EMPLOYEE add constraint FK_PROEMP_ON_PROJECT foreign key (project_id) references PROJECT(ID)^
alter table PROJECT_EMPLOYEE add constraint FK_PROEMP_ON_EMPLOYEE foreign key (employee_id) references EMPLOYEE(ID)^
-- end PROJECT_EMPLOYEE
