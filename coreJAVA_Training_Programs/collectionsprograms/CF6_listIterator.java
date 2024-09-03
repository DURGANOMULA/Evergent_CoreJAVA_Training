package com.evergent.corejava.collectionsprograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class CF6_listIterator {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("durga");
	a.add("sai");
	a.add("prasad");
	ListIterator i=a.listIterator();
	i.add("nomula");
	i.add("kanna");
	while(i.hasNext()) {
		String s=(String) i.next();
		System.out.println(s);
		
	}
}
}
