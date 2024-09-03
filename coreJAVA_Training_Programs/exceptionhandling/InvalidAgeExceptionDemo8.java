package com.evergent.corejava.exceptionhandling;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class InvalidAgeExceptionDemo8 {
public static void checkAge(int age) throws InvalidAgeException{
	if(age<18) throw new InvalidAgeException("age must be 18 or older");
	else System.out.println("eligible to vote");
}
public static void main(String[] args) {
	try {
		checkAge(13);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("caught the exception"+e.getMessage());
		System.out.println("caught the exception"+e.toString());
		
		System.out.println(e);
	}
	System.out.println("programs continues after handling the exception");
}
}
