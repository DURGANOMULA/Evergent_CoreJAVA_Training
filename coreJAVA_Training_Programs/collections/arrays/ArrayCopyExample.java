package com.evergent.corejava.collections.arrays;

import java.util.Arrays;

public class ArrayCopyExample {
public static void main(String[] args) {
	int a[]= {5,6,4,3,4};
	int copiedArray[]=Arrays.copyOf(a, 10);
	System.out.println("orginal array"+Arrays.toString(a));
	System.out.println(Arrays.toString(copiedArray));
}
}
