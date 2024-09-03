package com.evergent.corejava.wrapper_classes;

public class WrapperClassDemo2 {
public static void main(String[] args) {
	int a=10;
	//auto boxing
	Integer b=new Integer(a);
	System.out.println(b);
	
	//auto unboxing
	int c=b.intValue();
	System.out.println(c );
}
}
