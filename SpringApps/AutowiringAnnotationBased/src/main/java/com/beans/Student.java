package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private String sname;
	private Course curs;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Course getCurs() {
		return curs;
	}
	public void setCurs(Course curs) {
		this.curs = curs;
	}
	
	public Student(String sname, 
			@Autowired(required=true)
			@Qualifier("cur2")
			Course curs) {
		super();
		this.sname = sname;
		this.curs = curs;
	}
	
	
	public void StdInfo()
	{
		System.out.println("Student Name : " + this.getSname());
		System.out.println("Course Name : " + this.getCurs().getCname());
		System.out.println("Course Fees : " + this.getCurs().getFees());		
	}
	
	
}
