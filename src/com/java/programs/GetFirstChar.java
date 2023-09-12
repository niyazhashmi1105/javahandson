package com.java.programs;

public class GetFirstChar {

	public static void main(String[] args) {
		
		String str= "Learn with Java";
		getFirstChar(str);

	}

	private static void getFirstChar(String str) {
		
		String []words = str.split(" ");
		for(int i=0;i<words.length;i++) {
			
			String firstChar= words[i];
			System.out.print(firstChar.charAt(0)+",");
		}
		
	}

}
