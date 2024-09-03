package com.evergent.corejava.constructors;

public class Employee3 {
	int n;
	String d;
	double e;
Employee3(){
	System.out.println("default constructor");
}
Employee3(int n,String d,double e){
	this.n=n;
	this.d=d;
	this.e=e;
	
}
public void dispay() {
	System.out.println(n);
	System.out.println(d);
	System.out.println(e);
	
}
public static void main(String[] args) {
	new Employee3();
	new Employee3(5,"durga",5.65).dispay();;
	
}
}
