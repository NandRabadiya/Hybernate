package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

		public static void main(String []args) {
			
			 Configuration cfg=new Configuration();
		        cfg.configure("hibernate.cfg.xml");
		        SessionFactory factory = cfg.buildSessionFactory();
		        Session session=factory.openSession();
		        
		        //get student 106
		        
		        Student student=(Student)session.load(Student.class, 103);
		        Address ad=(Address)session.get(Address.class, 2);
		        
		        System.out.println(student);
		        System.out.println(ad.getCity());
		         
		        
		        session.close();
		        factory.close();
		        
		}
}
