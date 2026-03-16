package coms.apps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import coms.entities.Cricket;
import jakarta.persistence.TypedQuery;

public class ShowAllCricInfo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();		
		Session session = sf.openSession();
		
		TypedQuery<Cricket>  qry = session.createQuery("from Cricket");
		
		List<Cricket>  crkList = qry.getResultList();
		
		for(Cricket c: crkList)
			System.out.println(c.getCrno() + "\t" + c.getCrname() + "\t" + c.getGame() + "\t" + c.getRuns());
		
	}

}
