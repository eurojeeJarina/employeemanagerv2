package com.eurojee.employeemanagerv2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity // @Entity annotation is to map this class into database table

public class Employee implements Serializable {
    /*Why implement Serializable - it will help the java class to be transformed into different types of stream,
    because the data in this class is stored in the database and then going to be sent into frontend as json. it is best
    to implement this as serializable. It helps the whole process*/

    @Id // @Id annotation will give it a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // @GeneratedValue annotation will tell the database to generate a value automatically
    @Column(nullable = false, updatable = false) // set the ID column not to be null and not to be updatable or not to make any changes.
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    private String employeeCode;

    // private String department;
    // private Long salaryGrade;
}
