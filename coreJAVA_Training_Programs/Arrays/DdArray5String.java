package com.evergent.corejava.Arrays;

public class DdArray5String {
	public static void main(String[] args) {
		String a[][]=new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				//if(i==0||i==4||j==0||j==4) a[i][j]=;
				//else if() a[i][j]=7;
				//if(i+j==5)
				//else a[i][j]=1;
			a[i][j]="JAVA";
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
