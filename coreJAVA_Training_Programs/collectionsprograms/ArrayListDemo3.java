package com.evergent.corejava.collectionsprograms;
import java.util.*;
public class ArrayListDemo3 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(50);
	a.add(60);
	a.add(98);
	a.add(99);
	Iterator b=a.iterator();
	System.out.println(a);
	while(b.hasNext()) {
		System.out.println(b.next());
	}
	
}
}
