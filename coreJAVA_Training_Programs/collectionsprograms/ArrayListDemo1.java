package com.evergent.corejava.collectionsprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
public static void main(String[] args) {
ArrayList a=new ArrayList();
	a.add(55);
	a.add(555);
	a.add(5543443);
	a.add(34);
	a.add(54);
	a.add("nomula");
	System.out.println(a);
	Iterator<Integer> a1=a.iterator();
	while(a1.hasNext()) {
		System.out.println(a1.next());
	}
}
}
