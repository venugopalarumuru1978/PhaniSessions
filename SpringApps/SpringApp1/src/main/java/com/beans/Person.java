package com.beans;

public class Person {

	private String pname;
	private String email;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Person(String pname, String email) {
		super();
		this.pname = pname;
		this.email = email;
		System.out.println("Constructor");
	}
	
	public void PrintValues()
	{
		System.out.println("Person Name : " + this.getPname());
		System.out.println("Person Email : " + this.getEmail());		
	}
}
