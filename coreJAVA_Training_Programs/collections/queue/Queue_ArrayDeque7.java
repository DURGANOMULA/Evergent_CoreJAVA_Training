package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque7 {
public static void main(String[] args) {
	ArrayDeque<String> a=new ArrayDeque<>();
	a.add("banana");
	a.addFirst("pineapple");
	a.add("watermelon");
	a.addLast("papaya");
	a.addFirst("kiwi");
	a.offer("apple");
	a.offerLast("mango");
	System.out.println(a);
	System.out.println(a.poll());
	System.out.println(a.pollLast());
	System.out.println(a.pollFirst());
	
}
}
