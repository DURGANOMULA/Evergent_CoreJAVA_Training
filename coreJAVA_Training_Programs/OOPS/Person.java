package com.evergent.corejava.OOPS;

public class Person {
int age=23;
String nomula="durga";
String adress="bhadrachalam";
public void display() {
	System.out.println(age);
	System.out.println(nomula);
	System.out.println(adress);
}
public static void main(String[] args) {
	Person p1=new Person();
	p1.display();
}
}
