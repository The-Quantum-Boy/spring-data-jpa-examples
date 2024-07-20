package com.sumit.jpa.Jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
		return args -> {
			Student sumit = new Student();
			sumit.setFirstName("sumit");
			sumit.setEmail("sumit@nemk@123");
			sumit.setLastName("Dhanorkar");
			sumit.setAge("20");
			studentRepo.save(sumit);
		};
	}

}
