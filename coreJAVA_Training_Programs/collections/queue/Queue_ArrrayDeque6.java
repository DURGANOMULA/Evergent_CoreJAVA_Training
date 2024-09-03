package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;

public class Queue_ArrrayDeque6 {
public static void main(String[] args) {
	ArrayDeque<String> pq=new ArrayDeque<>();
	pq.add("nomula");
	pq.add("durga");
	pq.add("sai");
	pq.add("prasad");
	System.out.println(pq);
	System.out.println(pq.peek());
}
}
