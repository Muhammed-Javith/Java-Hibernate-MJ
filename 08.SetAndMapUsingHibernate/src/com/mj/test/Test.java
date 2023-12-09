package com.mj.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mj.Customer;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Customer c = new Customer();
		c.setCustId(1001);
		c.setCustName("mohan");
		c.getCustData().add("D1");
		c.getCustData().add("D2");
		c.getData().put(10, "M1");
		c.getData().put(11, "M2");
		ses.save(c);
		tx.commit();
		ses.close();

	}
}