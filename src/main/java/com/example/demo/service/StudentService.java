package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

  Student addStudent(Student student);

  List<Student> getAllStudents();

  Student getStudentByEmailId(String emailId);

  String deleteStudent(Long studentId);

  Student updateStudent(Student student);

}
