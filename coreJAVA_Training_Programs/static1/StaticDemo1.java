package com.evergent.corejava.static1;
//static member can call static method and varibles directly
public class StaticDemo1 {
static String cname="india";
String name="ravi";
public static void myData() {
	System.out.println("my data");
}
public static void main(String[] args) {
	System.out.println(cname);
	myData();
}
}
