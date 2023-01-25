package com.java.programs;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		char[] ch = str.toCharArray();
		
		int count=0;
		for(char c: ch) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		
		System.out.println("Total number of vowels present in "+str+ " are "+count);
		sc.close();
	}

}
