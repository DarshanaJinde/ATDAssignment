package com.atd.assignment.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Max(3)
	private Integer student_no;
	@Size(max=30)
	@NotBlank(message = "Name cannot be blank!")
	private String student_name;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date student_dob;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date student_doj;
}

/*
 * Table Name - STUDENT
STUDENT_NO INT (3)
STUDENT_NAME TEXT (30)
STUDENT_DOB DATE
STUDENT_DOJ DATE*/


/*JSON req-->
 * {
    "student_no": 1,
    "student_name": "Darsh",
    "student_dob": "27/12/2000",
    "student_doj": "15/10/2021"
}*/
