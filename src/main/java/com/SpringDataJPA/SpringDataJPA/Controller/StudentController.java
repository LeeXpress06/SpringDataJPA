package com.SpringDataJPA.SpringDataJPA.Controller;

import com.SpringDataJPA.SpringDataJPA.Model.Student;
import com.SpringDataJPA.SpringDataJPA.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

     @Autowired
     private  StudentService studentService

    @GetMapping("/getStudent/{name}")
    public Student getStudent(@PathVariable String name){

       return studentService.getAllStudentsByNAme(name);
     }











}
