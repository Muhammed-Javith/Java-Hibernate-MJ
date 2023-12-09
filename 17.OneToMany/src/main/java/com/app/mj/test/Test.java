package com.app.mj.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.mj.Module;
import com.app.mj.Product;
import com.app.mj.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Transaction tx = null;
		try (Session ses = HibernateUtil.getSf().openSession()) {
			tx = ses.beginTransaction();
			Module m1 = new Module();
			m1.setModId(101);
			m1.setModName("A");
			// m1.setModCost(3.3);
			Module m2 = new Module();
			m2.setModId(102);
			m2.setModName("B");
			// m2.setModCost(2.3);
			Product p = new Product();
			p.setProdId(10);
			p.setProdName("A");
			// p.setCost(2.2);
			p.getMob().add(m1);
			p.getMob().add(m2);
			// p.getMob().add(m3);
			ses.save(m1);
			ses.save(m2);
			// ses.save(m3);
			ses.save(p);
			tx.commit();
		}
	}
}
