package com.evergent.corejava.exceptionhandling;
//after exception remaning code will not excute
public class ExceptionDemo3 {
	String name=null;
	int k=0;
	public void myData() {
		try {
			int t=10/k;
			System.out.println(t);
			System.out.println("one");
			System.out.println(name.length());
			System.out.println();
		} 
		catch (ArithmeticException e) {
			System.out.println("i can handle:"+e);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("i can handle:"+e);
		}
	}
public static void main(String[] args) {
	ExceptionDemo3 d1=new ExceptionDemo3();
	d1.myData();
	

    
}
}
