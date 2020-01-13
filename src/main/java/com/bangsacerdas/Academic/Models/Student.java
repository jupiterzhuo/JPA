package com.bangsacerdas.Academic.Models;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tbl_student")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false,length = 100)
	private String name;
	
	@Column(nullable = false)
	private int age;

	//Relasi
	@OneToOne(mappedBy = "student")
	private Contact contact;
	//Relasi
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "student")
	private List<Assignment> assignments;
	//Relasi 
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "tbl_student_subject",
	joinColumns = @JoinColumn(name="student_id",
				referencedColumnName = "id"),
	inverseJoinColumns =@JoinColumn(name="subject_id",
				referencedColumnName = "id"))
	private List<Subject> subjects;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
}
