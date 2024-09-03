package com.evergent.corejava.exceptionhandling;

public class ExceptDemo7throws {
	String name=null;
	int k=0;
	private void myData()throws NullPointerException {
		// TODO Auto-generated method stub
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");

	}
public static void main(String[] args) {
	try {
		ExceptDemo7throws ex1=new ExceptDemo7throws();
		ex1.myData();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("i can handle "+e);
	}
}
}
