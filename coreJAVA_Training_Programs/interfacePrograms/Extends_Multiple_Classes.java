package com.evergent.corejava.interfacePrograms;
interface MyNewData{
	public void dataInfo();
}
interface Book2{
	String name="india";
	public void bookTitle();
	public void bookAuthor();
	public void bookCost();
}
interface NewBook1 extends MyNewData{
	public void myNewBook();
	public void bookPrize();
}



public class Extends_Multiple_Classes implements Book2,NewBook1 {
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
	public void dataInfo() {
		System.out.println("please print my data");
	}
	public static void main(String[] args) {
		Extends_Multiple_Classes b1=new Extends_Multiple_Classes();
		b1.bookAuthor();
		//m1.bookAuthor();
		b1.bookCost();
		b1.bookTitle();
		b1.myNewBook();
		b1.bookPrize();
		b1.dataInfo();
	}
}
