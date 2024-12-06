package com.klef.jfsd.Lab1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertStudent {
	public void insert(int id,String name, String gender , String department , String program , 
			String DOB,String phone , String GS , Double cgpa ,int noblogs) {
		// TODO Auto-generated method stub
		Student s = new Student();
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		s.setName("Neeraj");
//		s.setGender("male");
//		s.setDepartment("cse");
//		s.setProgram("B.Tech");
//		s.setDOB("06/05/2004");
//		s.setPhone("9030113396");
//		s.setGS("3rd Year");
//		s.setCgpa(9.54);
//		s.setBacklogs(0);
		s.setId(id);
		s.setName(name);
		s.setGender(gender);
		s.setDepartment(department);
		s.setProgram(program);
		s.setDOB(DOB);
		s.setPhone(phone);
		s.setGS(GS);
		s.setCgpa(cgpa);
		s.setBacklogs(noblogs);
		session.save(s);
		tx.commit();
	}
}