package coms.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import coms.entities.Cricket;

public class CricApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Cricket crk = new Cricket();
		
		crk.setCrno(102);
		crk.setCrname("Tilak Varma");
		crk.setGame("T20");
		crk.setRuns(600);
		session.persist(crk);
		t.commit();
		
		System.out.println("New Cricketer is Added...");
	}

}
