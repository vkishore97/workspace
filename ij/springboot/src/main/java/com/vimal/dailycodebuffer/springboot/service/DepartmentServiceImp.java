package com.vimal.dailycodebuffer.springboot.service;

import com.vimal.dailycodebuffer.springboot.entity.Department;
import com.vimal.dailycodebuffer.springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImp implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartmentById(Long departmentId, Department department) {
        Department temp = departmentRepository.findById(departmentId).get();

        if (Objects.nonNull((department.getDepartmentName()))
                && (!"".equalsIgnoreCase(department.getDepartmentName()))) {
            temp.setDepartmentName(department.getDepartmentName());
        }
        if (Objects.nonNull((department.getDepartmentCode()))
                && (!"".equalsIgnoreCase(department.getDepartmentCode()))) {
            temp.setDepartmentCode(department.getDepartmentCode());
        }
        if (Objects.nonNull((department.getDepartmentAddress()))
                && (!"".equalsIgnoreCase(department.getDepartmentAddress()))) {
            temp.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepository.save(temp);
    }
}
