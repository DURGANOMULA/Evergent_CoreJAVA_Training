package com.evergent.corejava.map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo3 {
public static void main(String[] args) {
	HashMap<String, String> capitalCities=new HashMap<>();
	capitalCities.put("india", "delhi");
	capitalCities.put("usa", "washington dc");
	capitalCities.put("germany", "berling");
	capitalCities.put("india", "hyderabad");
	System.out.println(capitalCities);
	for(String s:capitalCities.keySet()) {
		System.out.println(s);
	}
}
}
