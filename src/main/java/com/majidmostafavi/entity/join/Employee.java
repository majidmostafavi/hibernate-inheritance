package com.majidmostafavi.entity.join;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="EMPLOYEE" )
public class Employee  extends Person{

    @Column(name = "EMPLOYEE_CODE")
    private Long employeeCode;
}
