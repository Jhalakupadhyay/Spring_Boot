package com.jhalak.employee.RestServices;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jhalak.employee.Entity.Employee;
import com.jhalak.employee.ServiceLayer.EmployeeService;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestServices {
    EmployeeService service;

    public EmployeeRestServices(EmployeeService employee) {
        service = employee;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return service.findAll();
    }

    @GetMapping("/employees/{EmployeeId}")
    public Employee findEmployee(@PathVariable int EmployeeId) {
        Employee theEmployee = service.findById(EmployeeId);
        if (theEmployee == null) {
            throw new RuntimeException("Employee does not exist - " + EmployeeId);
        }
        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        // If the Employee Id is 0 then it will add the new employee else will update
        // the existing one with the given Id
        // so here we explicitaly change the Id to 0 because we want only to add the new
        // employee and not to update the existing one
        theEmployee.setId(0);
        Employee saved = service.save(theEmployee);
        return saved;
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId) {
        Employee theEmployee = service.findById(employeeId);
        if (theEmployee == null) {
            throw new RuntimeException("Cannot find Employee with Id - " + employeeId);
        }
        service.deleteById(employeeId);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {

        System.out.println(theEmployee.getFirstName() + " " + theEmployee.getLastname());
        if (theEmployee.getId() == 0) {
            throw new RuntimeException("New Employee cannot be added - " + theEmployee.getId());
        }
        Employee update = service.save(theEmployee);
        return update;
    }
}
