package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class Stack_Demo1 {
	public static void main(String[] args) {
		Stack myStack=new Stack<>();
		myStack.push("white");
		myStack.push("black");
		myStack.push("white");
		System.out.println(myStack);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}
}
