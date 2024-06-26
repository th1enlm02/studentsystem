package com.th1enlm02.student_service.service;

import com.th1enlm02.student_service.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudent(Integer id);
    public void deleteStudent(Integer id);
}
