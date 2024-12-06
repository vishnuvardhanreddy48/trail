package com.klef.jfsd.Lab1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectStudent {
public void select(int id)
{
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	
	Student s = (Student)session.load(Student.class, id);
	System.out.println("NAME = "+s.getName());
	System.out.println("Phone = "+s.getPhone());
	System.out.println("Department = "+s.getDepartment());
}
}
