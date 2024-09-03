package com.evergent.corejava.strings;

public class StringDemo7_Reverse_UsingStringBuilder {
public static void main(String[] args) {
	String name="durga nomula";
	StringBuilder s=new StringBuilder(name).reverse();
	System.out.println(s);
}
}
