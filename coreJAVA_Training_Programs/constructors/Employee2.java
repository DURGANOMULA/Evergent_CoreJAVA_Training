package com.evergent.corejava.constructors;

public class Employee2 {
	int n;
	String d;
	double e;
Employee2(){
	System.out.println("default constructor");
}
Employee2(int n1,String d1,double e1){
	n=n1;
	d=d1;
	e=e1;
	
}
public void dispay() {
	System.out.println(n);
	System.out.println(d);
	System.out.println(e);
	
}
public static void main(String[] args) {
	new Employee2();
	new Employee2(5,"durga",5.65).dispay();;

}
}
