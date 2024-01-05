package com.jhalak.employee.ServiceLayer;
import java.util.List;
import com.jhalak.employee.Entity.Employee;

public interface EmployeeService 
{
    List<Employee> findAll();   
    
    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId); 
}
