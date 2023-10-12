package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.Entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class Student_DAO_Impl implements Student_DAO
{
    private EntityManager entitymanager;

    @Autowired
    public Student_DAO_Impl(EntityManager entitymanager) {
        this.entitymanager = entitymanager;
    }

    @Override
    @Transactional
    public void Save(Student theStudent)
    {
        entitymanager.persist(theStudent);
    }
}
