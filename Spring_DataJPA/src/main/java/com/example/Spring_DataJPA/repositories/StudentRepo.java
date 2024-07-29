package com.example.Spring_DataJPA.repositories;

import com.example.Spring_DataJPA.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    Student findByName(String name);

}
