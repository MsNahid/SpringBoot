package com.nahidsohel.springbootthymeleafcrud.Service;

import com.nahidsohel.springbootthymeleafcrud.entity.Employee;
import com.nahidsohel.springbootthymeleafcrud.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findById(int theId);

    void save(Student employee);

    void deleteById(int theId);
}
