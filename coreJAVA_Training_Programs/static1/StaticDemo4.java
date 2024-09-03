package com.evergent.corejava.static1;
//static member can call static method and varibles directly
public class StaticDemo4 {
static String cname="india";
String name="nomula";
public static void myData() {
	System.out.println("my data");
}
public void myShow() {
	myData();
	System.out.println("non static method");
}
public static void main(String[] args) {
	System.out.println(cname);
	myData();
	StaticDemo4 s1=new StaticDemo4();
	s1.myShow();
}
}
