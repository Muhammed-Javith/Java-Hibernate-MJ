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
			emp.setPerId(201);
			emp.setPerName("Mohan");
			emp.setEmpSal(5000);
			emp.setEmpProj("P1");
			Student st = new Student();
			st.setPerId(301);
			st.setPerName("Sudhir kumar");
			st.setStdFee(6000);
			st.setGrade("A+");
			ses.save(p);
			ses.save(emp);
			ses.save(st);
			tx.commit();
			// ses.close();
		}
	}

}