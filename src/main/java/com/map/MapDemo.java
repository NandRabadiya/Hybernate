package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	       Session session=factory.openSession();
	        
	       Question q1=new Question();
	       q1.setQuestionId(1212);
	       q1.setQuestion("What is java ?");
	       
	       
	       Answer a1=new Answer();
	       a1.setAnswerId(243);
	       a1.setAnswer("Java is a programming language.");
	       a1.setQuestion(q1);
	       
	       q1.setAnswer(a1);
	       
	       Transaction tx=session.beginTransaction();
	        
	        //object save;
	        
	       session.save(a1);
	       
	        session.save(q1);
	        
	        
	        
	        tx.commit();
	        
	        
	        //fetching
	        
	       System.out.println( session.get(Question.class,1212 ));
	       
	       
	       session.close();
	       
	       
	       factory.close();
		

	}

}
