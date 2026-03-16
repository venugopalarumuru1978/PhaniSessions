package coms.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.DAO.StdDao;
import coms.beans.Student;

public class StdApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("JdbcConn.xml");
		StdDao  sa = (StdDao)context.getBean("std_dbCon");
		Scanner sc = new Scanner(System.in);
		Student std = null;
				
		while(true)
		{
			System.out.println("1. Add New Student\n2. View All\n3. Search\n4. Update Student\n5. Delete Student\n6. Exit");
			System.out.println("Pick ur Choice ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				std = new Student();
				System.out.println("Roll Number");
				std.setRollno(sc.nextInt());				
				System.out.println("Student Name ");
				std.setSname(sc.next());
				System.out.println("Student Course ");
				std.setCourse(sc.next());				
				System.out.println("Course Fees ");
				std.setFees(sc.nextFloat());
				
				sa.AddNewStudent(std);
				break;
			case 2:
				List<Student>  stdList = sa.ShowAll();
				for(Student s : stdList)
				{
					System.out.println(s.getRollno() + "\t" + s.getSname() + "\t" + s.getCourse() + "\t" + s.getFees());
				}
				break;
			case 3:
				System.out.println("Enter Roll Number to search");
				int rno = sc.nextInt();
				std = sa.SearchStd(rno);
				
				if(std!=null)
					System.out.println(std.getRollno() + "\t" + std.getSname() + "\t" + std.getCourse() + "\t" + std.getFees());
				else
					System.out.println("Student Not Found...");
				break;
			case 4:
				System.out.println("Enter Roll Number to Update");
				rno = sc.nextInt();
				std = sa.SearchStd(rno);
				
				if(std!=null)
				{
					System.out.println("Present Name of Student : " + std.getSname());
					System.out.println("Enter new name of student");
					String sname = sc.next();
					sa.UpdateStudent(rno, sname);
				}
				else
				System.out.println("Student Not Found...");
				break;
			case 5:
				System.out.println("Enter Roll Number to delete ");
				rno = sc.nextInt();
				std = sa.SearchStd(rno);
				
				if(std!=null) {
					System.out.println(std.getRollno() + "\t" + std.getSname() + "\t" + std.getCourse() + "\t" + std.getFees());
					System.out.println("Are u sure to delete(y/n)");
					String del = sc.next();
					if(del.equalsIgnoreCase("y"))
						sa.DeleteStudent(rno);					
				}
				else
					System.out.println("Student Not Found...");
				break;
			case 6:
				System.out.println("Thanks for using App");
				System.exit(0);
			}
		}
	}
}
