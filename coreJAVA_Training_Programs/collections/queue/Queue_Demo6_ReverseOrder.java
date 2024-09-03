package com.evergent.corejava.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo6_ReverseOrder {
public static void main(String[] args) {
	Queue<Integer>  pq=new PriorityQueue<>(Comparator.reverseOrder());
	pq.add(54);
	pq.add(2);
	pq.offer(45);
	pq.add(54);
	pq.add(545);
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
}
}
