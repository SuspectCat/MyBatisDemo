package com.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Department {
    private Integer departmentId;
    private String departmentName;
    private String departmentDescription;

    List<Employee> employees;
}
