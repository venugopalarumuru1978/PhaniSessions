package com.beanApps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Person;

public class PersonApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanConfig.xml");
		
		Person pObj = (Person)context.getBean("PerObj");
		
		pObj.PrintValues();
	}
}
