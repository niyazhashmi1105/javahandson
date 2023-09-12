package com.java.programs;

public class PrintEvenLengthWord {

	public static void main(String[] args) {
		
		String str="Java Selenium";
		
		for(String s: str.split(" ")) {
			
			
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}

	}

}
