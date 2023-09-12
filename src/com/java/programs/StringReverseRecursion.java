package com.java.programs;

public class StringReverseRecursion {

	public static void main(String[] args) {
		
		String s="selenium";
		System.out.println(reverseRecursion(s));
	}
	
	private static String reverseRecursion(String s) {
		
		if(s==null || s.length()<=1) { 
				return s;
		}
		return(reverseRecursion(s.substring(1)))+s.charAt(0);
	
	}

}
