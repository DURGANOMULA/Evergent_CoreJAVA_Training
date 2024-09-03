package com.evergent.corejava.collections.arrays;

import java.util.Arrays;

public class ArraysSortUsingSortMethod {
public static void main(String[] args) {
	int a[]= {5,44,66466,4,0,444,5454};
	System.out.println("befor sorting"+Arrays.toString(a));
	Arrays.sort(a);
	System.out.println("array after sorting using sort() methods  "+Arrays.toString(a));
}
}
