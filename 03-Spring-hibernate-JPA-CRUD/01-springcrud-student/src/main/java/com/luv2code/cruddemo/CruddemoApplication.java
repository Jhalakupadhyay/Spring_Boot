package com.luv2code.cruddemo;

import com.luv2code.cruddemo.Entity.Student;
import com.luv2code.cruddemo.dao.Student_DAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
//			createStudent(student_dao);
			displayStudentInOrder(student_dao);
		};
	}

	private void displayStudentInOrder(Student_DAO student_dao)
	{
		List<Student> studentList = student_dao.getInAsOrDesc();
		for(Student students : studentList)
		{
			System.out.println(students);
		}
	}

	private void createStudent(Student_DAO studentDao)
	{
		//create a student object
		Student student = new Student("aisehi","pandit","aisehi@gmail.com");
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
