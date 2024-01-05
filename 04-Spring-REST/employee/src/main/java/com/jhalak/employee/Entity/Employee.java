package com.jhalak.employee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    // Define Fileds Of the Table
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    // Define Constructor default for JPA
    public Employee() {
    }

    // Define Constructor with param
    public Employee(String firstName, String lastname, String mail) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.email = mail;
    }

    // Define getters/Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String mail) {
        this.email = mail;
    }

    // Define ToString
    @Override
    public String toString() {
        return "employee_entity [id=" + id + ", firstName=" + firstName + ", lastname=" + lastName + ", mail=" + email
                + "]";
    }

}
