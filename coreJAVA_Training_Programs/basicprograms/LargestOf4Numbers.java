package com.evergent.corejava.basicprograms;

import java.util.Scanner;

public class LargestOf4Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println((a>b&&a>c&&a>d)?a:(b>c&&b>d?b:(c>d?c:d)));
		
	}
}

