package com.mapper;

import com.pojo.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> findByDepartmentId(Integer departId);
}
