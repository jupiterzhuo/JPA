package com.bangsacerdas.Academic.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bangsacerdas.Academic.DTO.Student.RequestStudent;
import com.bangsacerdas.Academic.DTO.Student.ResponseStudent;
import com.bangsacerdas.Academic.Models.Student;
import com.bangsacerdas.Academic.Services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentServices studentServices;
	
	@GetMapping
	public List<ResponseStudent> listStudent(){
		return studentServices.listStudent();
	}
	
	@PostMapping
	public RequestStudent addStudent(@RequestBody RequestStudent newStudent) {
		RequestStudent response = studentServices.addStudent(newStudent);
		return response;
	}
	
	
}
