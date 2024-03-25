package com.vimal.dailycodebuffer.springboot.service;

import com.vimal.dailycodebuffer.springboot.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartmentById(Long departmentId, Department department);
}
