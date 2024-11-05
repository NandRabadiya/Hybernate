package com.map.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	       Session session=factory.openSession();
	       
	       Emp e1=new Emp(12,"ramesh");

	       Emp e2=new Emp(23,"suresh");
	       
	       Project p1=new Project(34,"java");
	       Project p2=new Project(37,"python");
	       
	       List<Emp> list1=new ArrayList<Emp>();
	       List<Project> list2=new ArrayList<Project>();
	       
	       list1.add(e1);
	       list1.add(e2);
	       
	       list2.add(p1);
	       list2.add(p2);
	       
	       e1.setProjects(list2);
	       p1.setEmp1(list1);
	       
	       Transaction tx=session.beginTransaction();
	       
	       session.save(e1);

	       session.save(e2);
	       session.save(p1);
	       session.save(p2);
	       
	       tx.commit();
	       
	       
	       session.close();
	       factory.close();
	        
	       
	}

}
