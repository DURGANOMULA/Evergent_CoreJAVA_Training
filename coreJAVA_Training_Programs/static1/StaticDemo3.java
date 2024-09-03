package com.evergent.corejava.static1;
//static member can call static method and varibles directly
public class StaticDemo3 {
static String cname="india";
public static void myData() {
	System.out.println("my data");
}
public void myShow() {
	System.out.println("non static method");
}
public static void main(String[] args) {
	System.out.println(cname);
	myData();
	StaticDemo3 s1=new StaticDemo3();
	s1.myShow();
}
}
