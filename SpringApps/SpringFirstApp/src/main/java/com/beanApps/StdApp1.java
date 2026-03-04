package com.beanApps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class StdApp1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanConfig.xml");
		Student  std = (Student)context.getBean("stdObj1");
		
		System.out.println("Student Name : " + std.getSname());
		System.out.println("Student Course : " + std.getCourse());
		System.out.println("Course Fees : " + std.getFees());
		
		System.out.println("---------------");
		Student  std2 = (Student)context.getBean("stdObj2");
		
		System.out.println("Student Name : " + std2.getSname());
		System.out.println("Student Course : " + std2.getCourse());
		System.out.println("Course Fees : " + std2.getFees());
	}
}
