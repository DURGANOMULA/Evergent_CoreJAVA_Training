package com.evergent.corejava.MultiThreading;

class MyClass extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo1_1stWay {
public static void main(String[] args) {
	MyClass t1=new MyClass();
	t1.setPriority(5);
	t1.start();
	MyClass t2=new MyClass();
	t2.setPriority(10);
	t2.start();
}
}
