package com.klef.jfsd.Lab1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {
public void update(int id)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Name");
	String name = sc.nextLine();
	System.out.print("Enter phone number");
	String cn =sc.nextLine();
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	
	Student s = (Student)session.get(Student.class, id);

	s.setName(name);
	s.setPhone(cn);
	session.save(s);
	tx.commit();
	System.out.println("Update Done!");
	
}
}
