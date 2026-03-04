package com.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private String sname;
	private List<String>  qualifications;
	private Set<String>  course;
	private Map<String, Integer> course_fees;
	private Properties  course_faculty;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<String> getQualifications() {
		return qualifications;
	}
	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}
	public Set<String> getCourse() {
		return course;
	}
	public void setCourse(Set<String> course) {
		this.course = course;
	}
	public Map<String, Integer> getCourse_fees() {
		return course_fees;
	}
	public void setCourse_fees(Map<String, Integer> course_fees) {
		this.course_fees = course_fees;
	}
	public Properties getCourse_faculty() {
		return course_faculty;
	}
	public void setCourse_faculty(Properties course_faculty) {
		this.course_faculty = course_faculty;
	}
	
	
	public void PrintStdInfo()
	{
		System.out.println("Student Name : " + this.getSname());
		System.out.println("Qualifications : " + this.getQualifications());
		System.out.println("Courses : " + this.getCourse());
		System.out.println("Course-Fees : " + this.getCourse_fees());
		System.out.println("Course-Faculty : " + this.getCourse_faculty());		
	}
}
