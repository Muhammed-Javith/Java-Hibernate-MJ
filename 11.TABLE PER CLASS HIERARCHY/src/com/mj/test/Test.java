package com.mj.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mj.Address;
import com.mj.Classes;
import com.mj.Student;
import com.mj.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		try (Session ses = HibernateUtil.getSf().openSession()) {
			Transaction tx1 = ses.beginTransaction();
			Student st = new Student();
			st.setStdId(1001);
			st.setStdName("Mohan");
			Address add = new Address();
			add.setStdId(101);
			add.setStdName("Sohan");
			add.setVillage("GH");
			add.setHoding_no(011);
			add.setCity("hyd");
			Classes cs = new Classes();
			cs.setStdId(102);
			cs.setStdName("Anil");
			cs.setClass_Name("MCA");
			ses.save(st);
			ses.save(add);
			ses.save(cs);
			tx1.commit();
			ses.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}