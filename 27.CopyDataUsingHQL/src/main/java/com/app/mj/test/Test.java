package com.app.mj.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.app.mj.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Transaction tx = null;
		try (Session ses = HibernateUtil.getSf().openSession()) {
			tx = ses.beginTransaction();
//insertion 
//			Employee emp1 = new Employee();
//			emp1.setEmpId(102);
//			emp1.setEmpName("Mohan");
//			emp1.setEmpSal(6000);
//			Employee emp2 = new Employee();
//			emp2.setEmpId(103);
//			emp2.setEmpName("Ramesh");
//			emp2.setEmpSal(7000);
//			ses.save(emp1);
//			ses.save(emp2);
			String hql = "insert into com.app.mj.EmpBackup(empIdBkp,empNameBkp,empSalBkp)Select empId,empName,empSal from com.app.mj.Employee";
			Query q = ses.createQuery(hql);
			int count = q.executeUpdate();
			tx.commit();
			System.out.println("copied:" + count);
			ses.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
