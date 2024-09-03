package com.evergent.corejava.collections.arrays;

public class EvergentTopics {
	private String name;
	private String des;
	private String id;
public EvergentTopics(String name,String des,String id) {
	this.name=name;
	this.des=des;
	this.id=id;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "name "+name+"des "+des+"id "+des+"\n";
}
}
