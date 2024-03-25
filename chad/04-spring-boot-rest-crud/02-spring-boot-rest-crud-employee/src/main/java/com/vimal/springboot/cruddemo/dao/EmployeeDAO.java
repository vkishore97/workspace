package com.vimal.springboot.cruddemo.dao;

import com.vimal.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}