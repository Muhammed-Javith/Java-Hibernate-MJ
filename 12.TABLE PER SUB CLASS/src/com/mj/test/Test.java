package com.mj.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mj.Employee;
import com.mj.Person;
import com.mj.Student;
import com.mj.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		try (Session ses = HibernateUtil.getSf().openSession()) {
			Transaction tx = ses.beginTransaction();
			Person p = new Person();
			p.setPerId(101);
			p.setPerName("Ramjatan");
			Employee emp = new Employee();
			emp.setPerId(102);

			emp.setPerName("Mohan");
			emp.setEmpSal(5000);
			Student st = new Student();
			st.setPerId(301);
			st.setPerName("Amit");
			st.setStdFee(505);
			st.setGrade("B+");
			ses.save(p);
			ses.save(emp);
			ses.save(st);
			tx.commit();
			ses.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}