package com.evergent.corejava.strings;

public class StringDemo1 {
public static void main(String[] args) {
	String s1=new String("nomula");
	String s2=new String("nomula");
	if(s1==s2) {
		System.out.println("true");
	}
	else System.out.println("false");
	if(s1.equals(s2)) {
		System.out.println("true");
	}
	else System.out.println("false");
}

}
