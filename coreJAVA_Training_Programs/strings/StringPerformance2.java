package com.evergent.corejava.strings;

import java.util.Arrays;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringPerformance2 {
public static void main(String[] args) {
	String s="durga nomula";
	System.out.println(Arrays.toString(s.toCharArray()));
	System.out.println(s.indexOf('u'));
	System.out.println("                 nomula            ".strip());
	//System.out.println(Arrays.toString(s
	char ch[]=s.toCharArray();
	for(char d:ch) {
		
		System.out.print(d);
	}
	System.out.println();
	
}
}
