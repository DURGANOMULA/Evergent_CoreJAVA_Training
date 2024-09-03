package com.evergent.corejava.strings;

public class StringPerformance {
public static void main(String[] args) {
	System.out.println('a'+'b');
	System.out.println('a'+3);
	System.out.println((char)('a'+3));
	System.out.println("a"+"b");
	
	String s="";
	for(int i=0;i<26;i++) {
		char ch=(char)('a'+i);
		s=s+ch;
	}
	System.out.println(s);
	
	
	System.out.println();
	//we can perform same operation using StringBuider
	
	StringBuilder s2=new StringBuilder();
	for(int i=0;i<26;i++) {
		char ch=(char)('a'+i);
		s2.append(ch);
	}
	System.out.println(s2);
	
}
}