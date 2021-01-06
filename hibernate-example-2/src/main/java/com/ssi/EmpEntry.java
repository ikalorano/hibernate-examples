package com.ssi;

import java.util.Scanner;

import org.hibernate.Transaction;

import org.hibernate.Session;

public class EmpEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter Code :");
//				int code=sc.nextInt();
//				
//		System.out.println("Enter Name : ");
//				String name=sc.next();
//				
//		System.out.println("Enter Salary : ");
//				int sal=sc.nextInt();
//		
//				Emp emp=new Emp(code,name,sal);
//				
				
			    Session session = Utility.getSF().openSession();
			    Transaction tr=session.beginTransaction();
			    
			    session.save(new Emp(111,"AAA",2000));
			    session.save(new Emp(112,"BBB",3000));
			    session.save(new Emp(113,"CCC",4000));
			    
			    tr.commit();
			    session.close();
			    
			    System.out.println("record stored successful");
	}
	

}
