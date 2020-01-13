package com.bangsacerdas.Academic.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bangsacerdas.Academic.Models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
