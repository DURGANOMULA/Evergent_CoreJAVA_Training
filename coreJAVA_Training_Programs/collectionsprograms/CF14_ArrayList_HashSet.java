package com.evergent.corejava.collectionsprograms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class CF14_ArrayList_HashSet {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("core java");
	list.add("j2eee");
	list.add("myJava");
	System.out.println(list);
	Set<String> s=new HashSet<>();
	s.addAll(list);
	System.out.println(s);
	
	
	
	Set<String> s1=new HashSet<>();
	s1.add("core java");
	s1.add("j2eee");
	s1.add("myjava");
	if (s.equals(s1)) {
		System.out.println("same");
	}
	else {
		System.out.println("not same");
	}
	
}
}
