package com.simplilearn.spring_core;

public class Employee {
	private int eid;
	private String ename;


	public Employee() {

		System.out.println("Employee object is created...");
	}

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}



}
