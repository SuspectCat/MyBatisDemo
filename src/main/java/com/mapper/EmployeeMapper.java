package com.mapper;

import com.pojo.Employee;

public interface EmployeeMapper {
    Employee findEmployeeByEmployeeId(Integer employeeId);
}
