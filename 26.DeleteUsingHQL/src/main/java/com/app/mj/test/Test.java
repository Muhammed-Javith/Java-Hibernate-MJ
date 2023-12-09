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
			String hql = "delete com.app.mj.Manager where mngId=:a";
			Query q = ses.createQuery(hql);
			q.setParameter("a", 111);
			int count = q.executeUpdate();
			tx.commit();
			System.out.println(count);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
