package com.springdatajpa.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(
		name = "products", 
		uniqueConstraints = {
				@UniqueConstraint(
						name="sku_unique",
						columnNames = "stop_keeping_unit"
				)
		}
)	
public class Product {
	
	@Id
	@SequenceGenerator(
			name = "product_generator",
			sequenceName = "product_sequence_name",
			allocationSize = 1
    )
	@GeneratedValue(
			strategy = GenerationType.IDENTITY,
			generator = "product_generator"
	)
	private Long id;
	
	@Column(name = "stop_keeping_unit",nullable = false )
	private String sku;
	
	@Column(nullable = false)
	private String name;
	
    private String description;
    
    private BigDecimal price;
    
    private boolean active;
    
    private String imageUrl;
    
    @CreationTimestamp
    private LocalDateTime dataCreated;
    
    @UpdateTimestamp
    private LocalDateTime lastUpdated;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public LocalDateTime getDataCreated() {
		return dataCreated;
	}

	public void setDataCreated(LocalDateTime dataCreated) {
		this.dataCreated = dataCreated;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}


}
