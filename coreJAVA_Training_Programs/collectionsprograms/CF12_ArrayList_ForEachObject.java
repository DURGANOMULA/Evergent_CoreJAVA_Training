package com.evergent.corejava.collectionsprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class CF12_ArrayList_ForEachObject {
public static void main(String[] args) {
	ArrayList<Object> myList=new ArrayList<>();
	myList.add(100);
	myList.add("durga");
	myList.add(44.5);
	for(Object o:myList) {
		System.out.println(o);
	}
}
}
