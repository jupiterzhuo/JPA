package com.bangsacerdas.Academic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bangsacerdas.Academic.Models.Contact;
import com.bangsacerdas.Academic.Models.Student;
import com.bangsacerdas.Academic.Repositories.ContactRepository;
import com.bangsacerdas.Academic.Repositories.StudentRepository;

@SpringBootApplication
public class AcademicApplication implements CommandLineRunner {

	@Autowired
	private ContactRepository contactRepository;
	@Autowired
	private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AcademicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		deleteAllData();
		saveAllData();
		showAllData();
	}
	
	@Transactional
	private void deleteAllData() {
		contactRepository.deleteAll();
		studentRepository.deleteAll();
	}
	
	@Transactional
	private void saveAllData() {
		Student jupiter =  new Student("Jupiter",17);
		Contact contactJupiter = new Contact("Jakarta", "+6283898986397", jupiter);
		contactRepository.save(contactJupiter);
	}
	
	@Transactional
	private void showAllData() {
		//List<Contact> contacts = contactRepository.findAll();
		List<Contact> contacts = new ArrayList<Contact>();
		contacts = contactRepository.findAll();
		List<Student> students = studentRepository.findAll();
		
		for (Student student : students) {
			System.out.println(student.getName());
		}
//		System.out.println("===================Contact:==================");
//		contacts.stream().forEach(System.out::println);
//         
//        System.out.println("===================Student:==================");
//        students.forEach(System.out::println);
	}

}
