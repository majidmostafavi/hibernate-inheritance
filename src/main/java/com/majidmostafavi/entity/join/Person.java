package com.majidmostafavi.entity.join;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "PERSON")
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "BIRTHDAY")
    private LocalDate birthday;
    @Column(name = "NATIONAL_CODE")
    private String nationalCode;
}
