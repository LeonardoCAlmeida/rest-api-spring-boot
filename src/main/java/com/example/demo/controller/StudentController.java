package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
  
  @Autowired
  private StudentService studentService;

  @GetMapping
  public List<Student> getAllStudents(){
    return studentService.getAllStudents();
  }

  @GetMapping("/{emailId}")
  public Student getStudentByEmailId(@PathVariable String emailId){
    return studentService.getStudentByEmailId(emailId);
  }

  @PostMapping
  public Student addStudent(@RequestBody Student student){
    return studentService.addStudent(student);
  }

  @PutMapping
  public Student updateStudent(@RequestBody Student student){
    return studentService.updateStudent(student);
  }
  
  @DeleteMapping("/{studentId}")
  public String deleteStudent(@PathVariable Long studentId){
    return studentService.deleteStudent(studentId);
  }
}
