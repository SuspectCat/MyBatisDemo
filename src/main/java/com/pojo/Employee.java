package com.pojo;

import lombok.Data;

@Data
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Integer employeeTelephone;
    private Integer employeeDepartment;

    private Department department;
}
