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
		try(Session ses=HibernateUtil.getSf().openSession()){
			//=======//Display all record=======
			String hql="from com.app.mj.Manager";
			Query q=ses.createQuery(hql);
			List<Manager>man=q.list();
			for(Manager m:man)
			{
			System.out.println(m);
			}
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
//		try (Session ses = HibernateUtil.getSf().openSession()) {
//			tx = ses.beginTransaction();
//			Manager m1 = new Manager();
//			m1.setMngId(107);
//			m1.setMngName("Mohit");
//			m1.setMngFee(484.4);
//			Manager m2 = new Manager();
//			m2.setMngId(108);
//			m2.setMngName("sumit");
//			m2.setMngFee(48.4);
//			Manager m3 = new Manager();
//			m3.setMngId(109);
//			m3.setMngName("amit");
//			m3.setMngFee(42.4);
//			Manager m4 = new Manager();
//			m4.setMngId(110);
//			m4.setMngName("Mohit");
//			m4.setMngFee(44.4);
//			ses.save(m1);
//			ses.save(m2);
//			ses.save(m3);
//			ses.save(m4);
//			tx.commit();
//			ses.close();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
	}
}
