package com.evergent.corejava.abstract1;
abstract  class Product3 {
	// abstract class constructor
	public Product3() {
		System.out.println("Product2 Constructor :abstract class");
	}

	   abstract  public void newProduct();
	  public void allProducts() {
		  System.out.println("All products");
	  } 	
}

 public class Constructor_With_Abstract_Class extends Product3 {
	
	 Constructor_With_Abstract_Class(){
		 System.out.println("ProductImpl3 : constructor");
	 }
	public void show() {
		System.out.println("Local show methods");
	}
	 
	public void newProduct() {
		 System.out.println("MY New Product");
	}

	public static void main(String[] args) {
		Constructor_With_Abstract_Class product1=new Constructor_With_Abstract_Class();
		product1.show();
		product1.newProduct();
		product1.allProducts();
		
	} 
}
