package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entities.Student;
import com.example.demo.Service.StudentService;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		StudentService studentService=new StudentService();
		
		Student s1=new Student(1L, "John", 80);
		Student s2=new Student(2L, "Smith", 90);
		
		studentService.addStudent(s1);
		studentService.addStudent(s2);
		
		System.out.println("All students");
		studentService.getAllStudents().forEach(System.out::println);
		
		studentService.updateScore(1L, 85);
		studentService.updateScore(2L, 95);
		
		studentService.deleteStudent(1L);
		
		System.out.println("students after removal:");
		studentService.getAllStudents().forEach(System.out::println);
		
	}

}
