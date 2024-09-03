package com.evergent.corejava.exceptionhandling;

public class ArrayIndexBoundOfException {
public static void main(String[] args) {
	int[] n= {40,45,432,664,4324};
	try {
		System.out.println(n[67]);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("caught an error"+e);
		System.out.println("error"+e.getMessage());
	}
	
}
}
