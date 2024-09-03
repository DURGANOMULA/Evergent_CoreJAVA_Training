package com.evergent.corejava.abstract1;

abstract class Product{
	abstract public void newProduct();
	public void allProducts() {
		System.out.println("this is the complete method from interface");
	}
}
public class ProductImplements_CreatingReferenceToAbstractClass extends Product {
	public void newProduct() {
   	 System.out.println("incomplet method i was completed here");
    }
    public void show() {
   	 System.out.println("this is complete method in imple");
    }
public static void main(String[] args) {
			Product p1=new ProductImplements_CreatingReferenceToAbstractClass();
			p1.allProducts();
			p1.newProduct();
			//p1.show();
}
}
