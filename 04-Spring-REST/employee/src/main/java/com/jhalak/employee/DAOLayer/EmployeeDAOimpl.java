package com.jhalak.employee.DAOLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jhalak.employee.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

@Repository
public class EmployeeDAOimpl implements EmployeeDAO {
    private EntityManager manager;

    @Autowired
    public EmployeeDAOimpl(EntityManager entitymanager) {
        manager = entitymanager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = manager.createQuery("from Employee", Employee.class);
        System.out.println("List of employees = " + query.getResultList());
        return query.getResultList();
    }

    @Override
    public Employee findById(int theId) 
    {
        Employee theEmployee = manager.find(Employee.class,theId);
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) 
    {
        Employee emp = manager.merge(theEmployee);
        return emp;
    }

    @Override
    public void deleteById(int theId) 
    {
        Employee theEmployee = manager.find(Employee.class,theId);
        manager.remove(theEmployee);
    }

}
