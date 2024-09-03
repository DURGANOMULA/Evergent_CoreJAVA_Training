package com.evergent.corejava.final1;

class MyClass{
	final public void myProducts() {
		System.out.println("all products");
	}
}
public class FinalWithMethodDemo3 extends MyClass {
 final String cname="India";
 public void myProducts1() {
	 System.out.println("new products");
 }
 public void myData() {
	 System.out.println(cname);
 }
 public static void main(String[] args) {
	FinalWithMethodDemo3 fd1=new FinalWithMethodDemo3();
	fd1.myData();
	fd1.myProducts();
}
}
