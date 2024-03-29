package com.java.programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "javap";
		String str2 ="avajd";
		
		System.out.println("Strings "+ str1+" and " +str2+ " are anagram: "+isAnagram(str1,str2));
	}

	private static boolean isAnagram(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		if(str1.length()!=str2.length()) {
			return false;
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
		
	}
}
