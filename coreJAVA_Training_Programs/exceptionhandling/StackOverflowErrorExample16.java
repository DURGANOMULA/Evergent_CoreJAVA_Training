package com.evergent.corejava.exceptionhandling;

public class StackOverflowErrorExample16 {
public static void main(String[] args) {
	try {
		recursiveMethod();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("stack overflow caught"+e.getMessage());
	}
}
public static void recursiveMethod() {
	recursiveMethod();
}
}
