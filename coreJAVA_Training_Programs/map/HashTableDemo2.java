package com.evergent.corejava.map;

import java.util.Hashtable;

public class HashTableDemo2 {
public static void main(String[] args) {
	Hashtable h=new Hashtable<>();
	h.put(100, "ramesh");
	h.put(200, "durga");
	h.put(300, "abbas");
	h.put(100, "xyz");
	System.out.println(h);
}
}
