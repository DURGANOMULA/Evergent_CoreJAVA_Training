package com.evergent.corejava.string.immutable;
final class ImmutabelString{
	private final String name;
	private final int age;
	public ImmutabelString(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
		public String myName()
		{
			return name;
		}
		public int myAge() {
			return age;
		}
		
		

}
public class MainPerson {
public static void main(String[] args) {
	ImmutabelString s=new ImmutabelString("durga", 22);
	System.out.println(s.myName());
	System.out.println(s.myAge());
}
}
 