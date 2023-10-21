package com.SpringPractice.demo.REST_SERVICES;

import com.SpringPractice.demo.utility.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class Rest_Controller
{
    List<Student> students = new ArrayList<Student>();

    @PostConstruct
    public void addData()
    {
        students.add(new Student("Jhalak","Upadhyay"));
        students.add(new Student("Anubhav","Mishra"));
        students.add(new Student("Abhinav","Mishra"));
        students.add(new Student("Piyush","Ojha"));
    }

    @GetMapping("/students")
    public List<Student> students_getter()
    {
        return students;
    }

    @GetMapping("/students/{studentID}")
    public Student getStudentById(@PathVariable int studentID)
    {
        if(studentID>=students.size() || studentID<0)
        {
            throw new StudentNotFoundExceptionHandler("Student not found at "+studentID);
        }
        return students.get(studentID);
    }

    //Adding an Exception Handler
    @ExceptionHandler
    public ResponseEntity<studentErrorResponse> handleException(StudentNotFoundExceptionHandler exe)
    {
        studentErrorResponse error = new studentErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exe.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
}
