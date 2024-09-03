package com.evergent.corejava.constructors;

public class Program9_CopyConstructor {
String  name;
int age;
public Program9_CopyConstructor(String name,int age) {
	this.name=name;
	this.age=age;
}
public Program9_CopyConstructor(Program9_CopyConstructor s) {
	this.name=s.name;
	this.age=s.age;
}
public void displayDetails() {
	System.out.println("name :"+name);
	System.out.println("age:"+age);
}
public static void main(String[] args) {
	Program9_CopyConstructor s1=new Program9_CopyConstructor("durga",20);
	Program9_CopyConstructor s2=new Program9_CopyConstructor(s1);
	s1.displayDetails();
	s2.displayDetails();
	
}
}
