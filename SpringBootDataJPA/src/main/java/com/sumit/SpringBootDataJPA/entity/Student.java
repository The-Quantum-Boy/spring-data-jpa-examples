package com.sumit.SpringBootDataJPA.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_table")
public class Student {

    @Id
    private String Id;

    private String name;

    private String email;

//    private String address;

    @OneToOne(fetch = FetchType.LAZY)
    private Address address;

}


id name email address addreid



