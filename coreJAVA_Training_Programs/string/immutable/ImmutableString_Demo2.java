package com.evergent.corejava.string.immutable;



class Data{
	private final String value;
	public Data(String value){
		this.value=value;
	}
	public String toString() {
		return value;
	}
	public String myValue() {
		return value;
	}
}

public class ImmutableString_Demo2 {
public static void main(String[] args) {
	Data d1=new Data("5");
	System.out.println(d1.toString());
	System.out.println(d1.myValue());
}
}
