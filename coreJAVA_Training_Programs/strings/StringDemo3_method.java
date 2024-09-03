package com.evergent.corejava.strings;

public class StringDemo3_method {
public static void main(String[] args) {
	String s=new String("Hii NOMULA are you from hyderabad? nnnnnnn you you you");
	String s1=new String("Hii NOMULA are you from hyderabad?");
	String s2="        durga          ";
	System.out.println(s.length());
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s2.trim().length());
	System.out.println(s.compareTo(s1));
	System.out.println(s.substring(4,10));
	String a[]=s.split(" ");
	for(String d:a) {
	System.out.println(d);
	}
	
	System.out.println(s.replace('n', 'd'));
	System.out.println(s.replaceAll("you","durga"));
	System.out.println(s.matches("are"));
	System.out.println(s.indexOf(""));
	
}
}
