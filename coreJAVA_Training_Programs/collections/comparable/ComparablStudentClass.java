package com.evergent.corejava.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablStudentClass {
public static void main(String[] args) {
	List<Student> s=new ArrayList<>();
	s.add(new Student("durga", 21));
	s.add(new Student("sai", 56));
	s.add(new Student("prasad", 54));
	
	System.out.println(s);
	Collections.sort(s);
	for (Student student : s) {
		System.out.println(student);
	}
}
}
