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
		st.setStdId(1002);
		st.setStdName("Ram");
		st.setStdFee(25520.70);
		st.setAge(25);
		ses.update(st);
		tx.commit();
		ses.close();
	}
}