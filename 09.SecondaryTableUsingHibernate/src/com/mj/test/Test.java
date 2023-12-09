package com.mj.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mj.Employee;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpId(1011);
		emp.setEmpName("Mohan");
		emp.setEmpSal(22.2);
		emp.setPrjs("p1");
		emp.setDetp("computer");
		ses.save(emp);
		tx.commit();
		ses.close();

	}
}