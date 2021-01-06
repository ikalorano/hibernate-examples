package com.ssi;

import org.hibernate.Session;

public class EmpSearch {

	public static void main(String[] args) {
		// fetching the details of emp 
		// on the basis of its ecode
		
		Session session=Utility.getSF().openSession();
		//transaction begin and commit is not needed
		//it is only retrieval hence not needed
		

		
		Emp emp=session.get(Emp.class, 112);
		System.out.println(emp);
//		System.out.println(emp.getEcode());
//		System.out.println(emp.getEname());
//        System.out.println(emp.getSal());
		session.close();

	}

}
