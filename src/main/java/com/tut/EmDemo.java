package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	       Session session=factory.openSession();
	        
	        Student student1=new Student();
	        student1.setId(123);
	        student1.setName("Nand Bhai");
	        student1.setCity("Giranar");
	        
	        Certificate c=new Certificate();
	        c.setCoruse("Android");
	        c.setDuration("2 month");
	        
	        student1.setCertificate(c);
	        
	        Student student2=new Student();
	        student2.setId(234);
	        student2.setName("Bhai");
	        student2.setCity("Gir");
	        
	        Certificate c1=new Certificate();
	        c1.setCoruse("Python");
	        c1.setDuration("2 month");
	        
	        student2.setCertificate(c1);
	        
	        Transaction tx=session.beginTransaction();
	        
	        //object save;
	        
	        session.save(student1);
	        session.save(student2);
	        
	        
	        
	        tx.commit();
	        session.clear();
	        
	        factory.close();

	}

}
