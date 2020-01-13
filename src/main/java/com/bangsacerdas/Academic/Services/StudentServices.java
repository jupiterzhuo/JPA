package com.bangsacerdas.Academic.Services;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bangsacerdas.Academic.DTO.Student.RequestStudent;
import com.bangsacerdas.Academic.DTO.Student.ResponseStudent;
import com.bangsacerdas.Academic.Models.Student;
import com.bangsacerdas.Academic.Repositories.StudentRepository;

@Service
public class StudentServices {
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	// List
	public List<ResponseStudent> listStudent(){
		List<Student> lstStudents = studentRepository.findAll();
		Type targetType = new 
				TypeToken<List<ResponseStudent>>() {}.getType();
		List<ResponseStudent> responseStudents = 
				modelMapper.map(lstStudents, targetType);
		return responseStudents ;
	}
	
	//Create 
	public RequestStudent addStudent(RequestStudent newStudent) {
		Student student = modelMapper.map(newStudent, Student.class);
		studentRepository.save(student);
		return newStudent;
	}
}
