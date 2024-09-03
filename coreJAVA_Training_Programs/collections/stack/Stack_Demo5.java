package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class Stack_Demo5 {
public static void main(String[] args) {
	Stack myStack=new Stack<>();
	myStack.push("apple");
	myStack.push("banana");
	myStack.push("cherry");
	myStack.push("date");
	System.out.println(myStack);
	Object topEle=myStack.peek();
	System.out.println("top element is"+topEle);
	Object removedEle=myStack.pop();
	System.out.println("remove elements is"+removedEle);
	System.out.println("stack after pop is"+myStack);
	boolean isEmply=myStack.isEmpty();
	System.out.println("is the stack empty"+isEmply);
	int pos=myStack.search("banana");
	System.out.println("postiton of banana from top is"+pos);
	myStack.clear();
	System.out.println("stack after clearing is"+myStack);
}
}
