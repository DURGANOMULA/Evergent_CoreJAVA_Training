package com.evergent.corejava.interfacePrograms;
//in interface we can specify default and static method directly
//static methods can acces with the help of interface name only
interface Animal{
	void sound();
	void color();
	default void leave() {
		System.out.println("it can leaves in forest");
	}
	static void talk() {
		System.out.println("animals will not talk like humans");
	}
    
	
}
class Dog implements Animal{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("bow bow");
		
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("dog varies in diffrent colors");
		
	}
}
class Cat implements Animal{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("meow meow");
		
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("cat color are diffrent");
		
	}
}
public class Animal_InterfaceWithConcreteMethods {
public static void main(String[] args) {
	Dog d=new Dog();
	d.sound();
	d.color();
	d.leave();
	Animal.talk();
	
}
}
