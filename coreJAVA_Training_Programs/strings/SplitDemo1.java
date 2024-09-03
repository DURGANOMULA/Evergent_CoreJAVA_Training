package com.evergent.corejava.strings;

public class SplitDemo1 {
public static void main(String[] args) {
	//use for loop
	String s="durga sai prasad";
	String d[]=s.split(" ");
	for(int i=0;i<d.length;i++) {
		System.out.println(d[i]);
	}
	System.out.println();
	System.out.println("below one is using for each loop");
	//using for each loop
	for(String p:d) {
		System.out.println(p);
	}
}
}
