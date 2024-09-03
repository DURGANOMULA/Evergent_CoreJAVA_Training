package com.evergent.corejava.javabeans;
class StudentBeans{
	private int sno;
	private String sname;
	private String add;
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String toString() {
		return "student no"+sno+"\n student name"+sname+"\n student address"+add;
	}
	
	

}
public class StudentImpApproach3 {
public static void main(String[] args) {
	StudentBeans s=new StudentBeans();
	s.setAdd("bhadrachalam");
	s.setSname("nomula");
	s.setSno(49494);
	
	System.out.println(s);
}
}
