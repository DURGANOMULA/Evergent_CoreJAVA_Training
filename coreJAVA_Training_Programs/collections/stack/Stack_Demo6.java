package com.evergent.corejava.collections.stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack_Demo6 {
public static void main(String[] args) {
	Stack<String> myStack=new Stack<>();
	myStack.push("red");
	myStack.push("black");
	myStack.push("white");
	System.out.println(myStack);
	
	//by using enumuration iteration
	System.out.println("enumeration iteration");
	Enumeration e=myStack.elements();
	while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
	System.out.println("by using iteration we can print");
	Iterator  i=myStack.iterator();
    while (i.hasNext()) {
		System.out.println(i.next());
	}
    System.out.println("by using foreach loop we are printing");
    for(String s:myStack) {
    	System.out.println(s);
    }
}
}
