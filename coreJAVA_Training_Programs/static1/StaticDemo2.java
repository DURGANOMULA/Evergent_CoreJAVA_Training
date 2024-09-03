package com.evergent.corejava.static1;

public class StaticDemo2 {
static String cname="india";
public static void myData() {
	System.out.println("my data");
}
public static void main(String[] args) {
	System.out.println(StaticDemo2.cname);
	StaticDemo2.myData();
}
}
