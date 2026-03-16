package com.beanApps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;
import com.beans.Student;

public class StudentApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanConfig.xml");
		
		Student stdObj = (Student)context.getBean("stdObj");
		stdObj.StdInfo();
	}
}
