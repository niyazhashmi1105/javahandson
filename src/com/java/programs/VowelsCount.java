package com.java.programs;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		
		String str= "Java programming";
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
		
	}

}
