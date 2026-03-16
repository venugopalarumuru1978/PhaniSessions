package com.beans;

public class Employee {

	private String ename;
	private String job;
	private float sal;
	private Account acc;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void PrintEmpInfo()
	{
		System.out.println("Employee Name : " + this.getEname());
		System.out.println("Employee Job : " + this.getJob());
		System.out.println("Employee Sal : " + this.getSal());
		System.out.println("Bank Account Number : " + this.getAcc().getAccNo());
		System.out.println("Bank Name : " + this.getAcc().getBankName());
	}
	
}
