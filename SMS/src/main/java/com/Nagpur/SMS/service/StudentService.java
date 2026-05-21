package com.Nagpur.SMS.service;

import java.util.List;

import com.Nagpur.SMS.Entity.Student;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(int id);
    
    void deleteStudentById(int id);
}