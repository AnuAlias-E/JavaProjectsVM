package com.training.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
