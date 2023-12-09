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
		Students st = new Students();
		st.setStdId(1001);
		st.setStdName("Ramjatan");
		st.setStdFee(22.2);
		st.setAge(24);
		ses.save(st);
		tx.commit();
		ses.close();
	}
}