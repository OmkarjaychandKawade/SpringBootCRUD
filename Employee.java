package com.demo.bean;

public class Employee {

	
	int id;
	int esal;
	String ename;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, int esal, String ename) {
		super();
		this.id = id;
		this.esal = esal;
		this.ename = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", esal=" + esal + ", ename=" + ename + "]";
	}

	
}
