package com.bangsacerdas.Academic.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bangsacerdas.Academic.Models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
