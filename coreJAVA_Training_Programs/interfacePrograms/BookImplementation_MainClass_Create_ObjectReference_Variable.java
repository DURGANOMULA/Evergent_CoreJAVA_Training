package com.evergent.corejava.interfacePrograms;


//we cant create object to interface but we create object reference
interface Book1{
	String name="india";
	public void bookTitle();
	public void bookAuthor();
	public void bookCost();
}
public class BookImplementation_MainClass_Create_ObjectReference_Variable implements Book1{
	public void bookTitle() {
		System.out.println("NOMULA BOOK");
	}
	public void bookAuthor() {
		System.out.println("durga nomula");
	}
	public void bookCost() {
		System.out.println("500 rs cost");
	}
	public static void main(String[] args) {
		Book1 b1=new BookImplementation_MainClass_Create_ObjectReference_Variable();
		b1.bookAuthor();
		//m1.bookAuthor();
		b1.bookCost();
		b1.bookTitle();
	}
	
}
