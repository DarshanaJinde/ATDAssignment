package com.atd.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atd.assignment.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{

}
