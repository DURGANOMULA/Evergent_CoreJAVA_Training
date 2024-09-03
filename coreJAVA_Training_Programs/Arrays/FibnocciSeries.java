package com.evergent.corejava.Arrays;

public class FibnocciSeries {
	public static void main(String[]args) {
		int range=5;
		int a=0;
		int b=1;
		int temp;
		for(int i=0;i<=range;i++) {
			System.out.println(a);
			temp=a+b;
			a=b;
			b=temp;
		}
	}
}
