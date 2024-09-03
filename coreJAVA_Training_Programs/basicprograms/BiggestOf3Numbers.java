package com.evergent.corejava.basicprograms;
import java.util.*;
public class BiggestOf3Numbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println((a>b&&a>c)?a:(b>c?b:c));
	
}
}
