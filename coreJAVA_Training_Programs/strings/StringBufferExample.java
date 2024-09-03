package com.evergent.corejava.strings;

public class StringBufferExample {
public static void main(String[] args) {
	StringBuffer s=new StringBuffer("hii nomula ");
	s.append("durga");
	System.out.println("after append->"+s);
	
	System.out.println(s.length());
	s.insert(16," sai prasad");
	System.out.println("after inserting ->"+s);
	s.replace(0, 3, "My");
	System.out.println("after replacing ->"+s);
	s.delete(0,3);
	System.out.println("after delete ->"+s);
	s.reverse();
	System.out.println("after reverse ->"+s);
	System.out.println("the capacity of the string is ->"+s.capacity());
	System.out.println("the length of the string is->"+s.length());
}
}
