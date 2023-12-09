package com.app.mj.test;

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
			Address a1 = new Address();
			a1.setAddrId(100);
			a1.setLoc("HYD");
			a1.setPin("50019");
			Employee e1 = new Employee();
			e1.setEmpId(1);
			e1.setEmpName("A");
			e1.setEmpSal(3.2);
			e1.setAddr(a1);
			Employee e2 = new Employee();
			e2.setEmpId(3);
			e2.setEmpName("C");
			e2.setEmpSal(4.4);
			ses.save(a1);
			ses.save(e1);
			ses.save(e2);
			tx.commit();
		}

	}
}
