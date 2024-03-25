package com.vimal.cruddemo.dao;

import com.vimal.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save (Student theStudent);

    Student findById (Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();

}