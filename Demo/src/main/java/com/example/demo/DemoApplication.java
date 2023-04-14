package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		Student s=context.getBean(Student.class);
		s.display();
		Student s1=context.getBean(Student.class);
		s1.display();
		System.out.println(s); // by default it is Singleton(creating only one object)
		System.out.println(s1);
	}
}
