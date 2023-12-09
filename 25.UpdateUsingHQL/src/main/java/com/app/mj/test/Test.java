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
			String hql = "update com.app.mj.Manager set mngName=:a,mngFee=:b where mngId=:c";
			Query q = ses.createQuery(hql);
			q.setParameter("a", "javith");
			q.setParameter("b", 10000.10);
			q.setParameter("c", 100);
			int count = q.executeUpdate();
			tx.commit();
			System.out.println(count);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
