package com.evergent.corejava.strings;

public class StringBuilderExample {
public static void main(String[] args) {
	String s="hey bhagavan";
	StringBuilder s1=new StringBuilder(s);
	//append operation
	s1.append(" ram chandra murthy");
	System.out.println("after appending ->"+s1);
	
	
	System.out.println("length of the string ->"+s1.length());
	//insert opearation
	s1.insert(31," sita kidhar hai");
	System.out.println("after inserting ->"+s1);
	
	
	//replace operation
	s1.replace(0, 3, "");
	System.out.println("after performing replace opeation ->"+s1);
	
	//delete opearation
	s1.delete(0, 9);
	System.out.println("after performing delete operation ->"+s1);
	
	System.out.println("after reverse operation ->"+s1.reverse());
}
	
	
}
