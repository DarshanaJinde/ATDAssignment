package com.atd.assignment.controller;

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

import com.atd.assignment.entity.Student;
import com.atd.assignment.service.StudentService;

@RestController
@RequestMapping("/atd")
public class StudentController {
	
	@Autowired
	private StudentService stud_service;
	
	@PostMapping("/student")
	public Student insertStudent(@RequestBody Student stud){
		return stud_service.insertStudent(stud);
	}
	
	@GetMapping("/student/{no}")
	public Student getStudentById(@PathVariable("no") Integer student_no){
		return stud_service.getStudentById(student_no);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return stud_service.getStudents();
	}
	
	@PutMapping("/student/{no}")
	public Student updateStudent(@PathVariable("no") Integer student_no,
								@RequestBody Student stud){
		return stud_service.updateStudent(student_no, stud);
	}
	
	@DeleteMapping("/student/{no}")
	public String deleteStudent(@PathVariable("no") Integer student_no){
		stud_service.deleteStudent(student_no);
		return "Student deleted successfully";
	}
}
