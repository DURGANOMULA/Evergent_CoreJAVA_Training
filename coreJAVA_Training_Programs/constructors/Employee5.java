package com.evergent.corejava.constructors;
//we can one constructor to another constructor throw this keyword within class
public class Employee5 {
	int n;
	String d;
	double e;
	
Employee5(int n){
	this.n=n;
	System.out.println("default constructor");
}
Employee5(int n,String d,double e){
	//this.n=n;
	//this.d=d;
	
	this(n);
	this.d=d;
	this.e=e;
}
public void dispay() {
	System.out.println(n);
	System.out.println(d);
	System.out.println(e);
	
}
public static void main(String[] args) {
	//new Employee5();
	new Employee5(5,"durga",5.65).dispay();;
	
}
}
