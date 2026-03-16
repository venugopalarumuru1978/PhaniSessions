package com.beanApps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanConfig.xml");
		
		Employee emp = (Employee)context.getBean("empObj");
		emp.PrintEmpInfo();
	}
}
