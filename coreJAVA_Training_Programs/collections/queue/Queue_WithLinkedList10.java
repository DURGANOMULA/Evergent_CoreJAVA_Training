package com.evergent.corejava.collections.queue;

import java.awt.Stroke;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Queue_WithLinkedList10 {
public static void main(String[] args) {
	Deque<String> a=new LinkedList<>();
	a.add("banana");
	a.addFirst("pineapple");
	a.add("watermelon");
	a.addLast("papaya");
	a.addFirst("kiwi");
	a.offer("apple");
	a.offerLast("mango");
	System.out.println(a);
	System.out.println(a.size());
	boolean b=a.isEmpty();
	System.out.println(b);
	a.clear();
	System.out.println(a);
	a.push("durga");
	System.out.println(a);
	
}
}
