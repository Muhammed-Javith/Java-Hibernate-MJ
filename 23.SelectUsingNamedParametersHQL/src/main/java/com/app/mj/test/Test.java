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
			String hql = "from com.app.mj.Manager where mngId = :a or mngName = :b";
			Query q = ses.createQuery(hql);
			q.setParameter("a", 102);
			q.setParameter("b", "meerab");
			List<Manager> m = q.list();
			m.forEach(System.out::println);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
//Note:Positional Query is depreceated since 5.1 so instead of this use named parameters. 