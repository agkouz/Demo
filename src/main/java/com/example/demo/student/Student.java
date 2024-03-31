package com.example.demo.student;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Student {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Integer age;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private LocalDate dob;

    /**
     * Empty constructor
     * */
    public Student() {
    }

    /**
     * Full constructor
     * */
    public Student(Long id, String name, Integer age, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.dob = dob;
    }

    /**
     * Constructor w/o id. The database will generate the id.
     * */
    public Student(String name, Integer age, String email, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
