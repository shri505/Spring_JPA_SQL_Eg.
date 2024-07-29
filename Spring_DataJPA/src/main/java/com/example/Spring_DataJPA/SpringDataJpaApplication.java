package com.example.Spring_DataJPA;

import com.example.Spring_DataJPA.entities.Student;
import com.example.Spring_DataJPA.repositories.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		// Correctly initialize the application context and the repository
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		// Get the StudentRepo bean from the context
		StudentRepo stRepo = context.getBean(StudentRepo.class);

		// Create and save a new Student entity
		// Uncomment to create and save a student
		// Student st = new Student();
		// st.setName("qwe");
		// st.setAddress("AUS");
		// stRepo.save(st);

		// Uncomment to fetch and print all students
		// List<Student> list = (List<Student>) stRepo.findAll();
		// list.forEach(student -> System.out.println(student));

		// Uncomment to find a student by ID and print it
		// Student st1 = stRepo.findById(1).get();
		// System.out.println(st1);

		// Uncomment to find a student by name and print it
		// Student st = stRepo.findByName("xyz");
		// System.out.println(st);

		// Pagination
//		Pageable pageable = PageRequest.of(0, 3);
//		Page<Student> page = stRepo.findAll(pageable);
//		page.get().forEach(student -> System.out.println(student));
	}
}
