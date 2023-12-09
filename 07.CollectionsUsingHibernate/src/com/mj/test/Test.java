package com.mj.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mj.Students;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Students st = new Students();
		st.setStdId(1001);
		st.setStdName("Raj");
		st.getStdData().add("D3");
		st.getStdData().add("D4");
		ses.save(st);
		tx.commit();
		ses.close();
	}
}