package com.evergent.corejava.exceptionhandling;
//define a unchecked exception  by using runtimeException
class InvalidScoreException extends RuntimeException{
	InvalidScoreException(String message){
		super(message);
	}
}
public class UserDefinedExceptionDemo12 {
public void validateScore(int score)//throws InvalidScoreException
{
	if(score<0||score>100) throw new InvalidScoreException("score must be 0 and 100");
	else System.out.println("score is valid");
}
public static void main(String[] args) {
	try {
		UserDefinedExceptionDemo12 d=new UserDefinedExceptionDemo12();
		d.validateScore(104);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("file no found"+e.getMessage());
		System.out.println(e);
	}
	System.out.println("flow of excution will continues after handling exceptions");
}
}
