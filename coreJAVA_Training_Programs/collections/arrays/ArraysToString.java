package com.evergent.corejava.collections.arrays;
import java.util.*;
/*
 * Converting Array to String
The Arrays.toString() method returns a string representation of the contents of the specified array.
 */
public class ArraysToString {
	public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Converting array to string
        String arrayString = Arrays.toString(fruits);

        System.out.println("Array as string: " + arrayString);
    }
}

