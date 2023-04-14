 package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);
		Student s=context.getBean(Student.class);
		s.display();
		Student s1=context.getBean(Student.class);
		s1.display();
		System.out.println(s);// creating  multiple objects using scope		
		System.out.println(s1);

	}
}
