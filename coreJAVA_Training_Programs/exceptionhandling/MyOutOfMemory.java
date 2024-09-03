package com.evergent.corejava.exceptionhandling;

public class MyOutOfMemory {
public static void main(String[] args) {
	Integer[] a=new Integer[100000000000*100000];
	System.out.println(a);
	
}
}
