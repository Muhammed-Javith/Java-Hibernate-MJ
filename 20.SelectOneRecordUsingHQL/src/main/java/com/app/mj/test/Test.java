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
			String hql = "select mngName from com.app.mj.Manager";
			Query q = ses.createQuery(hql);
			List<String> list = q.list();
			for (String s : list) {
				System.out.println(s);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
