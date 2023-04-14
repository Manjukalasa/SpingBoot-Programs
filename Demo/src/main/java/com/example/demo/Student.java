package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class Student
{
		public Student()
		{
			System.out.println("Student constructor");
		}
		void display()
		{
			System.out.println("hi Students"); 
		}
	}
