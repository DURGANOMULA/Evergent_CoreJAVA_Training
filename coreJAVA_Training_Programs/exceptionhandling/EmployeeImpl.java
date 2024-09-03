package com.evergent.corejava.exceptionhandling;

import java.io.Serializable;

class EmployeeBeans implements Serializable{
	private int eno;
	private String ename;
	private double esal;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	
	
}
 public class EmployeeImpl {
public static void main(String[] args) {
	EmployeeBeans e=new EmployeeBeans();
	//intializing values through setter methods
	e.setEno(5845);
	e.setEname("nomula");
	e.setEsal(84984.9);
	//getting values through getter methods
	System.out.println(e.getEname());
	System.out.println(e.getEno());
	System.out.println(e.getEsal());
	
}
}
 
 
