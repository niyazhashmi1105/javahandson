package com.java.programs;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		
		int num,r,c,n=1;
		
		System.out.println("Enter the number of rows:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		System.out.println("Floyds Triangle");
		for(r=1;r<=num;r++) {
			for(c=1;c<=r;c++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		
		sc.close();

	}

}
