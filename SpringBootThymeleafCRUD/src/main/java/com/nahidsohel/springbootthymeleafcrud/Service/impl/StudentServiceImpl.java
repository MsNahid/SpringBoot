package com.nahidsohel.springbootthymeleafcrud.Service.impl;

import com.nahidsohel.springbootthymeleafcrud.Repository.StudentRepository;
import com.nahidsohel.springbootthymeleafcrud.Service.StudentService;
import com.nahidsohel.springbootthymeleafcrud.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAllByOrderByNameAsc();
    }

    @Override
    public Student findById(int theId) {

        Optional<Student> student = studentRepository.findById(theId);

        Student result = null;

        if(student.isPresent()){
            result = student.get();

        }else{
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return result;
    }

    @Override
    public void save(Student student) {

        studentRepository.save(student);

    }

    @Override
    public void deleteById(int theId) {

        studentRepository.deleteById(theId);

    }
}
