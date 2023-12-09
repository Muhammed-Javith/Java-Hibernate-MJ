package com.mj.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mj.Address;
import com.mj.Employee;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Address addr = new Address();
		addr.setHno("6-11");
		addr.setLoc("BAN");
		Employee emp = new Employee();
		emp.setEmpId(1002);
		emp.setEmpName("Ram kumar");
		emp.setEmpSal(23.3);
		emp.setAddr(addr);
		ses.save(emp);
		tx.commit();
		ses.close();

	}
}