package com.jhalak.employee.ServiceLayer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jhalak.employee.DAOLayer.EmployeeDAO;
import com.jhalak.employee.Entity.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService
{

    private EmployeeDAO dao;
    
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employee)
    {
        dao = employee;
    }
     
    @Override
    public List<Employee> findAll() 
    {
        return dao.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int theId) {
         
        return dao.findById(theId);
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) 
    {
        return dao.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) 
    {
        dao.deleteById(theId);    
    }

}