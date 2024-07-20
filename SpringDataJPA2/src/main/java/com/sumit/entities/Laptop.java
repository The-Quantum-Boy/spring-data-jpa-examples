package com.sumit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_laptops")
public class Laptop {

	@Id
	private int laptopId;
	private String modelNumber;
	private String brand;
	
	
	@OneToOne
	private Student student;
	
}
