package com.bl.annotation;

public class Student {

	private String studentName;
	private String hobby;
	private String intrestedCourse;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}

	public void displayStudentInfo() {

		System.out.println("The Student name is " + studentName);
		System.out.println("Student's hobby is " + hobby);
		System.out.println("Student's intrested course is " + intrestedCourse);
	}
}
