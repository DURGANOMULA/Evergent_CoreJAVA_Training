package com.evergent.corejava.exceptionhandling;

//import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

class insufficentFundsException extends Exception{
	public insufficentFundsException(String message) {
		super(message);
	}
}
public class userDefinedExceptionFunds11 {
public static void withdraw(double amount)throws insufficentFundsException 
{
	double bankBalance=500;
	if(amount>bankBalance) {
		throw new insufficentFundsException("insufficient funds for withdraw");
	}
	else System.out.println("withdraw sucessful");
}
public static void main(String[] args) {
	try {
		withdraw(699);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("caught the exception"+e.toString());
		System.out.println(e);
	}
}
}
