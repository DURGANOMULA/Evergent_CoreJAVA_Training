package com.evergent.corejava.objectClasssMethods;

class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "name :"+name+" age :"+age;
	}
}
public class Myperson_overiding_toString_method {
public static void main(String[] args) {
	Person p1=new Person("DURGA", 23);
	System.out.println(p1);
	System.out.println(p1.hashCode());
}
}
