package com.evergent.corejava.exceptionhandling;
//creating userdefined exception
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("hello"+message);
	}
}
public class UserdefineExceptionProduct {
	int n=15;
	public void myData()throws ProductNotFoundException 
	{
		 if(n>100) throw new ProductNotFoundException("there is no products");
		 else System.out.println("products are there");
	}
public static void main(String[] args) {
	try {
		UserdefineExceptionProduct d1=new UserdefineExceptionProduct();
		d1.myData();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("i can handle error with"+e);
		
	}
}
}
