package com.evergent.corejava.OOPS;

class PersonData{
	public void myPersonData() {
		System.out.println("person data");
	}
}
class PersonInfo extends PersonData{
	public void myDetails() {
		System.out.println("person info class method");
	}
}
public class InheritanceMainMethod extends PersonInfo {
	public void show() {
		System.out.println("local  method");
	}
public static void main(String[] args) {
	InheritanceMainMethod m1=new InheritanceMainMethod();
	m1.show();
	m1.myDetails();
	m1.myPersonData();
}
}
