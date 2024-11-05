package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StatesDemo {
	
	public static void main(String []args) {
		
		System.out.println("Exaample: ");
		
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        Student student=new Student(1414,"New name","abc");
	        student.setCertificate(new Certificate("java hybernate","2 months"));
	        
	       //student: Transient state above
	    
	        Session session=factory.openSession();
	        Transaction tx=session.beginTransaction();
	        session.save(student);
	        //student: persistance states; 
	        student.setName("John");
	        
	        tx.commit();
	        
	        session.close();
	        
	        // student: Detached state
	        student.setName("Sachin");
	        
	        System.out.println(student);
	        
        factory.close();
	}

}
