package com.app.mj.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.app.mj.Manager;
import com.app.mj.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Transaction tx = null;
		try (Session ses = HibernateUtil.getSf().openSession()) {
			// =======//Display all record=======
			String hql = "select mngId,mngName from com.app.mj.Manager";
			Query q = ses.createQuery(hql);
			List<Object[]> list = q.list();
			for (Object[] ob : list) {
				System.out.println(ob[0] + "," + ob[1]);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
