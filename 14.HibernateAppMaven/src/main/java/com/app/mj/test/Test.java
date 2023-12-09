package com.app.mj.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.mj.Student;
import com.app.mj.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		try (Session ses = HibernateUtil.getSf().openSession()) {
			Transaction tx1 = ses.beginTransaction();
			Student st = new Student();
			st.setStdId(1002);
			st.setStdName("Sumanth");
			st.setStdFee(5000);
			ses.save(st);
			tx1.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
