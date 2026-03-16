package coms.apps;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import coms.entities.Cricket;

public class CricApp2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Cricket crk = new Cricket();
		
		System.out.println("Cricketer Name");
		crk.setCrname(br.readLine());
		System.out.println("Cricketer Game(T20/Oneday/Test)");
		crk.setGame(br.readLine());
		System.out.println("Cricketer Runs");
		crk.setRuns(Integer.parseInt(br.readLine()));
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		session.persist(crk);
		t.commit();
		
		System.out.println("New Cricketer is Added...");
	}

}
