package com.ssi;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmpEntry {

	public static void main(String[] args) {
	
		Configuration config=new Configuration().configure().addAnnotatedClass(Emp.class);
	
		SessionFactory sessionFactory=config.buildSessionFactory();
		
	   Session session=sessionFactory.openSession();
	   
	   Transaction tr=session.beginTransaction();
	   
	   Emp emp=new Emp();
	   emp.setEcode(1005); 
	   emp.setEname("JKL");
	   emp.setSal(8000);
	   emp.setDesg("OP");
	   session.save(emp);
	   
	   tr.commit();
	   System.out.println("Data Saved...");
	}

}
