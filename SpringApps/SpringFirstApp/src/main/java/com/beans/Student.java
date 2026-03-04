package com.beans;

public class Student {

	private String sname;
	private String course;
	private float fees;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
		
		System.out.println("Sname");
	}
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
		System.out.println("Course");
	}
	
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
		System.out.println("Fees");
	}
}
