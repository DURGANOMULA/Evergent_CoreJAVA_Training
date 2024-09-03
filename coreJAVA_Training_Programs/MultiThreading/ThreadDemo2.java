package com.evergent.corejava.MultiThreading;
class myClass2 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		
	}
}
public class ThreadDemo2 {
public static void main(String[] args) {
	myClass2 my=new myClass2();
	Thread t1=new Thread(my);
	t1.start();
}
}
