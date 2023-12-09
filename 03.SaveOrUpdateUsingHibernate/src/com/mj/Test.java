package com.mj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Employee e = new Employee();
		e.setEmpId(1041);
		e.setEmpName("Amit");
		e.setEmpSal(225000);
		ses.saveOrUpdate(e);
		tx.commit();
		ses.close();
	}
}