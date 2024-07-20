package com.sumit.SpringBootDataJPA.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address_table")
public class Address {

    @Id
    private String id;

    private  String street;

    private String city;

    private String country;

    @OneToOne(mappedBy = "address", cascade = CascadeType.PERSIST)
    private  Student student;
}

