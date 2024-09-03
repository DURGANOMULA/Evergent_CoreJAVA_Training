package com.evergent.corejava.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClassInLaptops {
public static void main(String[] args) {
	List<Laptops> a=new ArrayList<>();
	a.add(new Laptops("dell", 512, 70000));
	a.add(new Laptops("hp", 1000, 75000));
	a.add(new Laptops("lenovo", 128, 30000));
    Comparator<Laptops> c=new Comparator<Laptops>() {
    	public int compare(Laptops l1,Laptops l2) {
    		if(l1.getPrice()<l2.getPrice()) return 1;
    		else return -1;
    	}
	};
	Collections.sort(a,c);
	for (Laptops laptops : a) {
		System.out.println(laptops);
	}
	
}
}
