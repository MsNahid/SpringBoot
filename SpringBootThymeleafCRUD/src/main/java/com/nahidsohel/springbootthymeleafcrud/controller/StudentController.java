package com.nahidsohel.springbootthymeleafcrud.controller;


import com.nahidsohel.springbootthymeleafcrud.Service.StudentService;
import com.nahidsohel.springbootthymeleafcrud.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    @GetMapping("/list")
    public String listStudents(Model theModel) {

        // get employees from db
        List<Student> studentList = studentService.findAll();

        // add to the spring model
        theModel.addAttribute("studentList", studentList);

//        System.out.println(studentList.size());

        return "students/list-students";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Student student = new Student();

        theModel.addAttribute("student", student);

        return "students/student-form";
    }


    @PostMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("studentId") int theId,
                                    Model theModel) {

        // get the student from the service
        Student theStudent = studentService.findById(theId);

        // set student as a model attribute to pre-populate the form
        theModel.addAttribute("student", theStudent);

        // send over to our form
        return "students/student-form";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student theStudent) {

        // save the student
        studentService.save(theStudent);

        // use a redirect to prevent duplicate submissions
        return "redirect:/students/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("studentId") int theId) {

        // delete the student
        studentService.deleteById(theId);

        // redirect to /students/list
        return "redirect:/students/list";

    }
}