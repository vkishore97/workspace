package com.vimal.dailycodebuffer.springboot.controller;

import com.vimal.dailycodebuffer.springboot.entity.Department;
import com.vimal.dailycodebuffer.springboot.service.DepartmentService;
import com.vimal.dailycodebuffer.springboot.service.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public void deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartmentById(departmentId, department);
    }

}