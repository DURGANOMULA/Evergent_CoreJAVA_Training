package com.evergent.corejava.static1;
//static block
public class StaticDemo6 {
	public static String name="nomula";
	int age=23;
	String add="hyderabad";
	public void display() {
		name="durga nomula";
		System.out.println(name);
		System.out.println(age);
		System.out.println(add);
	}
public static void main(String[] args) {
	StaticDemo6 d1=new StaticDemo6();
	System.out.println(d1.name);
	d1.display();
	StaticDemo6 d2=new StaticDemo6();
	System.out.println(d2.name);
	
}
}
