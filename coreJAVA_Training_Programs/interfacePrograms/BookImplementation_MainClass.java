package com.evergent.corejava.interfacePrograms;
interface Book{
	String name="india";
	public void bookTitle();
	public void bookAuthor();
	public void bookCost();
}
public class BookImplementation_MainClass implements Book {
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
		BookImplementation_MainClass m1=new BookImplementation_MainClass();
		m1.bookAuthor();
		//m1.bookAuthor();
		m1.bookCost();
		m1.bookTitle();
	}
}
