package com.ssi;

import org.hibernate.Transaction;

import org.hibernate.Session;

public class EmpUpdate {

	public static void main(String[] args) {
		// we need to set the salary of ecode 113 to 7500
		Emp emp=new Emp();
		
		//id of the record which has to be changed
		emp.setEcode(113); 
		
		//the new salary
		emp.setSal(7500);
		
		
//		System.out.println(emp);
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		
		session.update(emp);
		tr.commit();
		session.close();
		
	}

}
