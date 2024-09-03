package com.evergent.corejava.OOPS;

public class MethodWritingTypes {
	//no arguments with no returntype
	public void display() {
		System.out.println("hii nomula");
	}
	//no argument with returntype
	public int element() {
		return 5;
	}
	//argument with return type
	public int add(int a,int b) {
		return a+b;
	}
	//argument with no return type
	public void mul(int a,int b) {
		System.out.println(a*b);
	}
	
public static void main(String[]args) {
	MethodWritingTypes m1=new MethodWritingTypes();
	m1.display();
	m1.mul(5, 6);
	int d=m1.element();
	System.out.println(d);
	int e=m1.add(5,88);
	System.out.println(e);
}
}
