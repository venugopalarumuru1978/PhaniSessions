package com.beans;

public class Course {

	private String cname;
	private float fees;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
	public Course(String cname, float fees) {
		super();
		this.cname = cname;
		this.fees = fees;
	}
	
	
}
