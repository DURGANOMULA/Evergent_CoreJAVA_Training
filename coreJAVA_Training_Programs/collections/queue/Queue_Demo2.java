package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo2 {
public static void main(String[] args) {
	Queue<Integer> pq=new PriorityQueue<>();
	pq.add(1);
	pq.add(2);
	pq.add(5);
	pq.add(9);
	//in queue there is not pop() method instead of that we use poll()
	System.out.println(pq);
	System.out.println(pq.peek());
	System.out.println(pq.poll());
	System.out.println(pq);
	
}
}
