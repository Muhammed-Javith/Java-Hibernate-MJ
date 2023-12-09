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
			String hql = "from com.app.mj.Manager";
			Query q = ses.createQuery(hql);
			q.setFirstResult(4); //starts fromm 4th row
			q.setMaxResults(6); //maximum results needs to be printed
			List<Manager> empob = q.list();
			empob.forEach(System.out::println);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
