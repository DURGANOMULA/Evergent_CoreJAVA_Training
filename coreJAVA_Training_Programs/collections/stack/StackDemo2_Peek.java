package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class StackDemo2_Peek {
public static void main(String[] args) {
	Stack myStack=new Stack<>();
	myStack.push("red");
	myStack.push("black");
	myStack.push("white");
	System.out.println(myStack);
	System.out.println(myStack.peek());
	System.out.println(myStack);
}
}
