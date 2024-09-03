package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class Stack_Demo5_Methods {
public static void main(String[] args) {
	Stack<String> s=new Stack<>();
	s.add("A");
	s.add("b");
	s.add("f");
	System.out.println(s);
	String topele=s.peek();
	System.out.println(topele);
	String removed=s.pop();
	System.out.println("remove ele "+removed);
	System.out.println(s);
	boolean isEmpty=s.isEmpty();
	System.out.println("is the empty stack "+isEmpty);
	int pos=s.search("A");
	System.out.println("position of b "+pos);
	s.clear();
	System.out.println("stack after clear is "+s);
}
}
