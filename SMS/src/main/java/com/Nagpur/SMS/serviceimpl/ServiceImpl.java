package com.Nagpur.SMS.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nagpur.SMS.Entity.Student;
import com.Nagpur.SMS.repository.StudentRepository;
import com.Nagpur.SMS.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(int id) {

        return studentRepository.findById(id).get();
    }
    
    @Override
    public void deleteStudentById(int id) {

        studentRepository.deleteById(id);
    }
}