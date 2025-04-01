package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public Student addStudent(Student student) {
    return studentRepository.save(student);    
  }

  @Override
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  @Override
  public Student getStudentByEmailId(String emailId) {
    return studentRepository.findByEmailId(emailId);
  }

  @Override
  public String deleteStudent(Long studentId) {
    studentRepository.deleteById(studentId);
    return "Student with ID " + studentId + " deleted successfully";
  }

  @Override
  public Student updateStudent(Student student) {
    return studentRepository.save(student);
  }
   
}
