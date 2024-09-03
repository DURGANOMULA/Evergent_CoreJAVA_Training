package com.evergent.corejava.exceptionhandling;

import java.io.File;
import java.util.Scanner;

public class CompileTimeFileDemo15 {
public static void main(String[] args) {
	try {
		File f=new File("C:/mydata/commndlinefileforExceptionhandling.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("file not found"+e.toString());
		e.printStackTrace();
	}
}
}
