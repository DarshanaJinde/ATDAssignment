package com.atd.assignment.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atd.assignment.entity.Student;
import com.atd.assignment.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository stud_repo;

	public Student insertStudent(Student stud) {
		return stud_repo.save(stud);
	}

	public Student getStudentById(Integer student_no) {
		return stud_repo.findById(student_no).get();
	}

	public Student updateStudent(Integer student_no, Student stud) {
		Student studOld=stud_repo.findById(student_no).get();
		
		if(Objects.nonNull(stud.getStudent_name())) {
			studOld.setStudent_name(stud.getStudent_name());
		}
		
		if(Objects.nonNull(stud.getStudent_dob())) {
			studOld.setStudent_dob(stud.getStudent_dob());
		}
		
		if(Objects.nonNull(stud.getStudent_doj())) {
			studOld.setStudent_doj(stud.getStudent_doj());
		}
		return stud_repo.save(studOld);
	}

	public List<Student> getStudents() {
		return stud_repo.findAll();
	}

	public void deleteStudent(Integer student_no) {
		stud_repo.deleteById(student_no);;
	}

	
}
