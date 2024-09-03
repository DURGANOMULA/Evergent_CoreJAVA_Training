package com.evergent.corejava.Arrays;

public class DdArray6 {
	public static void main(String[] args) {
		int count=1;
		int a[][]=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a[i][j]=count;
				count++;
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
