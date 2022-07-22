package com.bl.annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	

	@Value("${Student.studentName}")
	private String studentName;
	
	
	@Value("${Student.hobby}")
	private String hobby;
	
	@Value("${Student.intrestedCourse}")
	private String intrestedCourse;
	

	

	
	
	public void displayStudentInfo() {

		System.out.println("The Student name is " + studentName);
		System.out.println("Student's hobby is " + hobby);
		System.out.println("Student's intrested course is " + intrestedCourse);
	}
}
