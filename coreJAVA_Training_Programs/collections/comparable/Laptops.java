package com.evergent.corejava.collections.comparable;

public class Laptops {
private String brandName;
private int ram;
private int price;
public Laptops(String brandName, int ram, int price) {
	this.brandName = brandName;
	this.ram = ram;
	this.price = price;
}
public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptops [brandName=" + brandName + ", ram=" + ram + ", price=" + price + "]";
}


}
