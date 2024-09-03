package com.evergent.corejava.collectionsprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class CF10_ArrayList_Generics {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(546);
	list.add(55);
	list.add(44);
	System.out.println(list);
	
	Iterator i=list.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
		
	}
}
}
