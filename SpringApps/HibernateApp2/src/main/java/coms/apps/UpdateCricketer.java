package coms.apps;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import coms.entities.Cricket;
import jakarta.persistence.TypedQuery;

public class UpdateCricketer {

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Cricketer Number ");
		int cno = sc.nextInt();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		TypedQuery<Cricket>  qry = session.createQuery("from Cricket where crno=:cn");
		qry.setParameter("cn", cno);
		
		List<Cricket>  crkList = qry.getResultList();
		
		if(crkList.isEmpty())
			System.out.println("No Cricketer Found");
		else
		{
			Cricket c = crkList.get(0);			
			System.out.println("Present Name : " + c.getCrname());
			
			System.out.println("Enter new name");
			String crname = sc.next();
			
			qry = session.createQuery("Update Cricket set crname=:cna where crno=:cn");
			qry.setParameter("cn", cno);
			qry.setParameter("cna", crname);
			qry.executeUpdate();
			t.commit();
			System.out.println("Updated");
		}		
	}
}
