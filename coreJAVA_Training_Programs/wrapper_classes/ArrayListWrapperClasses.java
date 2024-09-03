package com.evergent.corejava.wrapper_classes;
import java.util.*;
import java.util.ArrayList;

public class ArrayListWrapperClasses {
	public static void main(String[] args) {
		int a=10;
		Integer b=new Integer(a);
		ArrayList c= new ArrayList();
		c.add(b);
		Integer d=new Integer(500);
		c.add(d);
		c.add(new Integer(200));
		System.out.println(c);
		System.out.println();
		//after jdk 1.5 autoboxing and autounboxing happens we can see
		System.out.println("after jdk 1.5 autoboxing and autounboxing happens we can see");
	
		ArrayList c1=new ArrayList<>();
		c1.add(500);
		System.out.println(c1);
	}




}
