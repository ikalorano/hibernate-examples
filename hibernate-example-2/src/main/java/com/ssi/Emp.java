package com.ssi;

import javax.persistence.*;

@Entity
//@Table(name="employee")
public class Emp {
	@Id
//	@Column(name="code")
private int ecode;
	
//	@Column(name="name")
private String ename;
	
//	@Column(name="salary")
private int sal;

//constructor
public Emp(int ecode, String ename, int sal) {
	super();
	this.ecode = ecode;
	this.ename = ename;
	this.sal = sal;
}


//getter and setter methods
public int getEcode() {
	return ecode;
}
public void setEcode(int ecode) {
	this.ecode = ecode;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}


public Emp(int ecode) {
	super();
	this.ecode = ecode;
}


public Emp() {
	super();
}

@Override 

public String toString() {
	return "Emp [ecode= " + ecode + ", ename=" + ename + ", sal=" + sal + "]";
}


}
