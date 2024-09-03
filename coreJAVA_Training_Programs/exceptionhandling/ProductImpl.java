package com.evergent.corejava.exceptionhandling;

import java.io.Serializable;

class ProductBeans implements Serializable{
	private int pno;
	private String pname;
	private double psal;
	public int getPno() {
		return pno;
	}
	public String getPname() {
		return pname;
	}
	public double getPsal() {
		return psal;
	}
	
	public ProductBeans(int pno, String pname, double psal) {
		//super();
		this.pno = pno;
		this.pname = pname;
		this.psal = psal;
	}
	
	
}
public class ProductImpl {
	public static void main(String[] args) {
		ProductBeans b=new ProductBeans(565, "nomula", 565645);
		System.out.println(b.getPname());
		System.out.println(b.getPno());
		System.out.println(b.getPsal());
	}


}
