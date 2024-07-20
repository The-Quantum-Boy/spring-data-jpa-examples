package com.sumit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_student")
public class Student {
	
	  @Id
	  @SequenceGenerator(
			  name = "stud_sequence",
			  sequenceName = "stud_sequence",
			  allocationSize = 1
	  )
	  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stud_sequence")
	  private int studentId;
	  
	  private String studentName;
	  private String about;
	  
	  @OneToOne(mappedBy = "student")
	  private Laptop laptop;
	  
}
