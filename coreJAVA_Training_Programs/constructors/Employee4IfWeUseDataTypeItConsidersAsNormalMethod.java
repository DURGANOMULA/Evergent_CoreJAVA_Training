package com.evergent.corejava.constructors;
//if we kept any datatype infront of constructor it can be converted into normal method
public class Employee4IfWeUseDataTypeItConsidersAsNormalMethod {
void Employee4IfWeUseDataTypeItConsidersAsNormalMethod() {
	System.out.println("default constructor");
}
public static void main(String[] args) {
	Employee4IfWeUseDataTypeItConsidersAsNormalMethod e1=new Employee4IfWeUseDataTypeItConsidersAsNormalMethod();
	e1.Employee4IfWeUseDataTypeItConsidersAsNormalMethod();
}
}
