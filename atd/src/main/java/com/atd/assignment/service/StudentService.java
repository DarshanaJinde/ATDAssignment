package com.atd.assignment.service;

import java.util.List;

import com.atd.assignment.entity.Student;

public interface StudentService {

	public Student insertStudent(Student stud);

	public Student getStudentById(Integer student_no);

	public List<Student> getStudents();

	public Student updateStudent(Integer student_no, Student stud);

	public void deleteStudent(Integer student_no);

}
