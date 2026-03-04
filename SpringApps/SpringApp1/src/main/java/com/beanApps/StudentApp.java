package com.beanApps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Person;
import com.beans.Student;

public class StudentApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("StdConfig.xml");
		Student std = (Student)context.getBean("stdObj");
		std.PrintStdInfo();
	}
}
