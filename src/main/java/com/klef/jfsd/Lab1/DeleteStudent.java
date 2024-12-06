package com.klef.jfsd.Lab1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
public void delete(int id)
{
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	
	Student s = (Student)session.get(Student.class, id);
	session.delete(s);
	
	//session.save(s);
	tx.commit();
}
}
