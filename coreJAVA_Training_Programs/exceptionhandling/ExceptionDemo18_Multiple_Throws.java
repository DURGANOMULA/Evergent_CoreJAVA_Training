package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo18_Multiple_Throws {
String name="null";
int k=0;
public void myData() throws NullPointerException,ArithmeticException{
	System.out.println("one");
	System.out.println(name.length());
	System.out.println(5/k);
	System.out.println("end");
}
public static void main(String[] args) {
	try {
		ExceptionDemo18_Multiple_Throws a=new ExceptionDemo18_Multiple_Throws();
		a.myData();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("i can handle"+e);
	}
}
}
