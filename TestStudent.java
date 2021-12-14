package com.student.example;

public class TestStudent {

	public static void main(String[] args) {
	
		Student1 student1 = new Student1();
		
		Student student= new Student();
		
		student=student1.add();
		System.out.println("the name of student is -- "+student.getName());
		System.out.println("the dresscode of student is -- "+student.getDressCode());
		
		
		
	}
}
