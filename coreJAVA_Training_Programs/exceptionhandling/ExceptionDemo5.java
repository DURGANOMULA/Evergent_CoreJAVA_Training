package com.evergent.corejava.exceptionhandling;
//after exception remaning code will not excute
public class ExceptionDemo5 {
	String name=null;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println();
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("i can handle:"+e);
		}
		catch (Exception e) {
			System.out.println("i can handle:"+e);
		}
	    finally {
			System.out.println("final block close connections");
			
		}
	}
public static void main(String[] args) {
	ExceptionDemo5 d1=new ExceptionDemo5();
	d1.myData();
	

    
}
}
