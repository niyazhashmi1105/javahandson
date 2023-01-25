package com.java.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		boolean prime=true;
		System.out.println("Enter number to check for prime");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		sc.close();
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		if(prime==true)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" not a prime number");
		

	}

}
