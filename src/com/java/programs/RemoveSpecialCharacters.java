package com.java.programs;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {

		//@#$$$$  Niyaz   hashmi@#$%%((((((
		
				String str = "@#$$$$  Niyaz   hashmi@#$%%((((((";
				System.out.println(removeSpecialChar(str));
		}
	
private static String removeSpecialChar(String str) {
		
		Character ch;
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			
			ch = str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();

		
	}

}
