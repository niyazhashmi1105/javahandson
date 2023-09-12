package com.java.programs;

public class ExtractDigits {

	public static void main(String[] args) {

		String str ="Niya123456z";
		System.out.println(getDigitFromString(str));

	}
	
	private static String getDigitFromString(String str) {
		
		String digit= "";
		str = str.trim();
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				digit = digit+ch;
			}
		}
		return digit;
		
		
	}

}
