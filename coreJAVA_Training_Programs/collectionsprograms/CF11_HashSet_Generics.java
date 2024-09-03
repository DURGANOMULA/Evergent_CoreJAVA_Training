package com.evergent.corejava.collectionsprograms;

import java.util.HashSet;
import java.util.Iterator;

class Book{
	String name;
	public Book(String name){
		this.name=name;
	}
	
}
public class CF11_HashSet_Generics {
public static void main(String[] args) {
	HashSet<Integer> h=new HashSet<>();
	h.add(100);
	h.add(9943);
	h.add(323);
	System.out.println(h);
	Iterator i=h.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
	}
}
}
