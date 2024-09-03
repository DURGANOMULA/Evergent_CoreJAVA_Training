package com.evergent.corejava.OOPS;

public class AddMethodOverloading {
	public void add(int a,int b,int c) {
	System.out.println(a+b+c);
}
	public void add(int a,int b) {
	System.out.println(a+b);
	}
	public void add(double a,int b) {
	System.out.println(a+b);
	}
	public void add(double a,double b) {
	System.out.println(a+b);
	}
public static void main(String[] args) 
{
	
	AddMethodOverloading m1=new AddMethodOverloading();
	m1.add(5, 6);
	m1.add(5.5, 5.3);
	m1.add(5.4, 3);
	m1.add(5, 6, 9);
}
}
