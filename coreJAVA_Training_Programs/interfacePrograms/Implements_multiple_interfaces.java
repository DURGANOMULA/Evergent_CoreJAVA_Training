package com.evergent.corejava.interfacePrograms;


interface Book1{
	String name="india";
	public void bookTitle();
	public void bookAuthor();
	public void bookCost();
}
interface NewBook{
	public void myNewBook();
	public void bookPrize();
}
public class Implements_multiple_interfaces implements Book1,NewBook {
	public void bookTitle() {
		System.out.println("NOMULA BOOK");
	}
	public void bookAuthor() {
		System.out.println("durga nomula");
	}
	public void bookCost() {
		System.out.println("500 rs cost");
	}
	public void myNewBook() {
		System.out.println("i bought new book");
	}
	public void bookPrize() {
		System.out.println("900 rs");
	}
	public static void main(String[] args) {
		Implements_multiple_interfaces b1=new Implements_multiple_interfaces();
		b1.bookAuthor();
		//m1.bookAuthor();
		b1.bookCost();
		b1.bookTitle();
		b1.myNewBook();
		b1.bookPrize();
	}
}
