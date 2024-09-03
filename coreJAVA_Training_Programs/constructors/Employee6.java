package com.evergent.corejava.constructors;
 //by using super keyword we are taking data from child class to parent class

class Employee{
	 int eno;
	 public Employee(){
		 
	 }
	 public Employee(int eno) {
		 System.out.println("my employye no"+eno);
	 }
 }
public class Employee6 extends Employee
{
	int eno;
	String d;
	double e;
Employee6()
{
	System.out.println("default constructor");
}
Employee6(int eno,String d,double e)
{
	//this.n=n;
	super(eno);
	this.d=d;
	this.e=e;
	
}
public void dispay()
{
	System.out.println(eno);
	System.out.println(d);
	System.out.println(e);
	
}
public static void main(String[] args)
{
	new Employee6();
	new Employee6(5,"durga",5.65).dispay();;
	
}
}
