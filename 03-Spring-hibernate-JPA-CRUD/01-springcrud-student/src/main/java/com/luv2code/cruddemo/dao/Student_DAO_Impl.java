package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Student findById(int Id) {
        return entitymanager.find(Student.class,Id);
    }

    @Override
    public List<Student> getInAsOrDesc() {
        TypedQuery<Student> theQuery = entitymanager.createQuery("FROM Student order by last_name asc",Student.class);
        return theQuery.getResultList();
    }
}
