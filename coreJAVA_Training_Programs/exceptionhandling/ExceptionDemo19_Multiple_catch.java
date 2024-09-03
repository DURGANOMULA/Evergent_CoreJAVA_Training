package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo19_Multiple_catch {
String name=null;
int k=0;
public void myData() throws NullPointerException,ArithmeticException{
	System.out.println("one");
	System.out.println(name.length());
	System.out.println(5/k);
	System.out.println("end");
}
public static void main(String[] args) {
	try {
		ExceptionDemo19_Multiple_catch a=new ExceptionDemo19_Multiple_catch();
		a.myData();
	} catch (NullPointerException | ArithmeticException e) {
		// TODO: handle exception
		System.out.println("i can handle"+e);
	}
}
}
