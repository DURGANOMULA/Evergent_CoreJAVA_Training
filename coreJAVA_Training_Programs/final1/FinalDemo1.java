package com.evergent.corejava.final1;
//variables cant be modified
public class FinalDemo1 {
final String cname="india";
public void myData() {
	System.out.println(cname);
}
public static void main(String[] args) {
	FinalDemo1 fd1=new FinalDemo1();
	fd1.myData();
}
}
