package com.app.mj.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.mj.Employee;
import com.app.mj.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Transaction tx = null;
		try (Session ses = HibernateUtil.getSf().openSession()) {
			tx = ses.beginTransaction();
			Employee e1 = new Employee();
			e1.setEmpId(10);
			e1.setEmpName("Mohan kumar");
			e1.setEmpSal(5000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ses.save(e1);
			tx.commit();
			// ses.close();
			System.out.println("Greate Your Record Saved");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
