package com.evergent.corejava.collections.arrays;

import java.util.Arrays;

//we can fill array with using fill method
public class ArraysFill {
public static void main(String[] args) {
	int num[]=new int[5];
	Arrays.fill(num, 99);
	System.out.println("filled array"+Arrays.toString(num));
}
}
