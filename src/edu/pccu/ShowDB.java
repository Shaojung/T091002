package edu.pccu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ShowDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf = new Configuration();

		cf = cf.configure();
		SessionFactory factory = cf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Student s = null;
		s = (Student) session.get(Student.class, 4);
		System.out.println(s.getStudent_name());
	}

}
