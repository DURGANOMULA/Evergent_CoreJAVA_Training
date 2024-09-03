package com.evergent.corejava.map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo4 {
public static void main(String[] args) {
	TreeMap<Integer, String> st=new TreeMap<>();
	st.put(102, "nomula");
	st.put(101, "durga");
	st.put(103, "sai");
	st.put(104, "prasad");
	System.out.println(st);
	for (Entry<Integer, String> entry : st.entrySet()) {
		Integer key = entry.getKey();
		String val = entry.getValue();
		System.out.print(key+" ");
		System.out.println(val);
		
	}
}
}
