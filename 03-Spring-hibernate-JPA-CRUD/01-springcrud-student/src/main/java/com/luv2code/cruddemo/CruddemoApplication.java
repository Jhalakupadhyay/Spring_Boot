package com.luv2code.cruddemo;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.luv2code.cruddemo.Entity.Student;
import com.luv2code.cruddemo.dao.Student_DAO;
import com.luv2code.cruddemo.dao.Student_DAO_Impl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(Student_DAO student_dao)
	{
		return runner ->
		{
			createStudent(student_dao);
		};
	}

	private void createStudent(Student_DAO studentDao)
	{
		//create a student object
		Student student = new Student("Jhalak","Upadhyay","jhalak@gmail.com");
		//Save a student Object
		studentDao.Save(student);
		//display Student ID
		System.out.println("Student Id = "+ student.getId());

		//get student by Id
		Student mystudent = studentDao.findById(student.getId());

		//Display student
		System.out.println("The Student is = "+mystudent);
	}
}
