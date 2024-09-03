package com.evergent.corejava.static1;
//static block
public class StaticDemo5 {
static String cname="india";
static {
	System.out.println("hii nomula");
}
static public void myData() {
	System.out.println("my data");
}
public static void main(String[] args) {
	System.out.println(cname);
	myData();
}
}
