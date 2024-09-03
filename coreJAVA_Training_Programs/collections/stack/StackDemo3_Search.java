package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class StackDemo3_Search {
public static void main(String[] args) {
	Stack myStack=new Stack<>();
	myStack.push("red");
	myStack.push("black");
	myStack.push("white");
	System.out.println(myStack.search("black"));
	System.out.println(myStack);
}
}
