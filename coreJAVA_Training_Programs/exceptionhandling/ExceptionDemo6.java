package com.evergent.corejava.exceptionhandling;
//after exception remaning code will not excute
public class ExceptionDemo6 {
	String name=null;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println();
		} 
		finally {
			System.out.println("try block will follow catch or finally");
		}
	}
public static void main(String[] args) {
	ExceptionDemo6 d1=new ExceptionDemo6();
	d1.myData();
	

    
}
}
