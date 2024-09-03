package com.evergent.corejava.final1;
//if we declare class as final it is not possible to extend the class
final class MyClass{
	final public void myProducts() {
		System.out.println("all products");
	}
}
public class FinalWithMethodDemo2 //extends MyClass 
{
 final String cname="India";
 public void myProducts1() {
	 System.out.println("new products");
 }
 public void myData() {
	 System.out.println(cname);
 }
 public static void main(String[] args) {
	FinalWithMethodDemo2 fd1=new FinalWithMethodDemo2();
	fd1.myData();
	new MyClass().myProducts();
}
}
