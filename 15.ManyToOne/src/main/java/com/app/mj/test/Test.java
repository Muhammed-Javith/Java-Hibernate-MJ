package com.app.mj.test;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.mj.Address;
import com.app.mj.Employee;
import com.app.mj.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Transaction tx = null;
		try (Session ses = HibernateUtil.getSf().openSession()) {
			tx = ses.beginTransaction();
			Address addr = new Address();
			addr.setAddrId(101);
			addr.setLoc("HYD");
			addr.setPin("58849");
			Employee e1 = new Employee();
			e1.setEmpId(1);
			e1.setEmpName("A");
			e1.setEmpSal(3.3);
			e1.setAddr(addr);
			// alt+shift+R -> to rename local variable
			Employee e3 = new Employee();
			e3.setEmpId(3);
			e3.setEmpName("B");
			e3.setEmpSal(4.3);
			e3.setAddr(addr);
			ses.save(addr);
			ses.save(e1);
			// ses.save(e2);
			ses.save(e3);
			tx.commit();
		}
	}
}
