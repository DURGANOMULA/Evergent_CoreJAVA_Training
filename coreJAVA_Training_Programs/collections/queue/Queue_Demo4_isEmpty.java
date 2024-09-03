package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo4_isEmpty {
public static void main(String[] args) {
	Queue<Integer> q=new PriorityQueue<>();
	q.offer(56);
	q.add(545);
	q.add(4);
	q.add(565);
	q.clear();
	boolean b=q.isEmpty();
	System.out.println(b);
	System.out.println(q);
}
}
