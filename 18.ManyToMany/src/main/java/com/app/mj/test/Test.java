package com.app.mj.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.mj.Course;
import com.app.mj.Student;
import com.app.mj.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Transaction tx = null;
		try (Session ses = HibernateUtil.getSf().openSession()) {
			tx = ses.beginTransaction();
			Course c1 = new Course();
			c1.setCrId(1);
			c1.setCrName("CJ");
			c1.setCrCost(2.2);
			Course c2 = new Course();
			c2.setCrId(2);
			c2.setCrName("AJ");
			c2.setCrCost(5.5);
			Course c3 = new Course();
			c3.setCrId(3);
			c3.setCrName("HI");
			c3.setCrCost(5.5);
			Student s1 = new Student();
			s1.setStdId(88);
			s1.setStdName("AJ");
			s1.setStdMarsk(3.36);
			s1.getCobs().add(c1);
			s1.getCobs().add(c2);
			Student s2 = new Student();
			s2.setStdId(89);
			s2.setStdName("VJ");
			s2.setStdMarsk(8.98);
			s2.getCobs().add(c2);
			s2.getCobs().add(c3);
			Student s3 = new Student();
			s3.setStdId(90);
			s3.setStdName("UJ");
			s3.setStdMarsk(7.88);
			s3.getCobs().add(c1);
			ses.save(c1);
			ses.save(c2);
			ses.save(c3);
			ses.save(s1);
			ses.save(s2);
			ses.save(s3);
			tx.commit();
			// ses.close();
		}
	}
}
