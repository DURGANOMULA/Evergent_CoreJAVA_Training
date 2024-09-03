package com.evergent.corejava.collectionsprograms;

import java.util.ArrayList;
import java.util.Iterator;

class Book{
	String name;
	public Book(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
public class CF9_ArrayList_BookObject {
	public static void main(String[] args) {
		Book b1=new Book("durga");
		Book b2=new Book("sai");
		Book b3=new Book("prasad");
		
		ArrayList a=new ArrayList<>();
		a.add(b1);
		a.add(b2);
		a.add(b3);
		System.out.println(a);
		/*Iterator i=a.iterator();
		while (i.hasNext()) {
			 System.out.println(i.next());
			
		}*/
	}
	
	
	
}
