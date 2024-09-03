package com.evergent.corejava.exceptionhandling;
//HERE EXCEPTION IS THROWING LINE BY LINE
public class ExceptDemo7throws2 {
	String name=null;
	int k=0;
	public void myData()throws NullPointerException {
		// TODO Auto-generated method stub
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");

	}
	public void myShow()throws NullPointerException{
		myData();
		System.out.println("my change method");
	}
	
public static void main(String[] args)throws NullPointerException {
	try {
		ExceptDemo7throws2 ex1=new ExceptDemo7throws2();
		ex1.myShow();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("i can handle "+e);
	}
}
}
