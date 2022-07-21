package com.bl.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stu = context.getBean("student", Student.class);
		stu.cheating();

		AnotherStudent anotherStudent = context.getBean("anotherStu", AnotherStudent.class);
		anotherStudent.startCheating();

	}

}
