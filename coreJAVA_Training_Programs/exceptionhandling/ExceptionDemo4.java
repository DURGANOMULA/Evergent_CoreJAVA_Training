package com.evergent.corejava.exceptionhandling;
//after exception remaning code will not excute
public class ExceptionDemo4 {
	String name=null;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println();
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("i can handle:"+e);
		}
		catch (Exception e) {
			System.out.println("i can handle:"+e);
		}
	}
public static void main(String[] args) {
	ExceptionDemo4 d1=new ExceptionDemo4();
	d1.myData();
	

    
}
}
