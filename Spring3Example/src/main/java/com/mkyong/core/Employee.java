package com.mkyong.core;

import java.util.List;

public class Employee implements Person {
	
	private String id;
	private String fname;
	private String lname;
	private List<Address> adr;
	
	
	
	public Employee() {
		super();
	}
	public Employee(String id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	public List<Address> getAdr() {
		return adr;
	}
	public void setAdr(List<Address> adr) {
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", adr=" + adr + "]";
	}
	public void disply(Person p) {
		
		System.out.println(p);
		
	}
	

}
