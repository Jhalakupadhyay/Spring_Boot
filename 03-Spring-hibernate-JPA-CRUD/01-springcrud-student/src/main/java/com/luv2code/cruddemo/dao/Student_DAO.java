package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.Entity.Student;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface Student_DAO
{
    void Save(Student theStudent);

    Student findById(int Id);

    List<Student> getInAsOrDesc();

}
