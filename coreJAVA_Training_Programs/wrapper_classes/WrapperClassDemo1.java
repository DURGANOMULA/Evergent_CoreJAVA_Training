package com.evergent.corejava.wrapper_classes;

public class WrapperClassDemo1 {
public static void main(String[] args) {
	int a=10;
	//auto boxing
	Integer b=new Integer(a);
	//System.out.println(b);
	//auto unboxing
	int c=b.intValue();
	//System.out.println(c );
	double d=909.44;
	Double d1=new Double(d);
	double d2=d1.doubleValue();
	byte by=5;
	Byte by1=new Byte(by);
	byte by2=by1.byteValue();
	float f=4.4f;
	Float f1=new Float(f);
	float f2=f1.floatValue();
	System.out.println("int value is "+a);
	System.out.println("integer object value is "+b);
	System.out.println("cover interger object value to primitive is " +c);
	
	System.out.println();
	
	System.out.println("float value is "+f);
	System.out.println("float object value is "+f1);
	System.out.println("convert float object value to primitive is " +f2);
	System.out.println();
	
	System.out.println("double value is "+d);
	System.out.println("double object value is "+d1);
	System.out.println("convert double object value to primitive is " +d2);
	System.out.println();
	
	
	System.out.println("byte value is "+by);
	System.out.println("byte object value is "+by1);
	System.out.println("convet byte object value to primitive is " +by2);
	
}
}
