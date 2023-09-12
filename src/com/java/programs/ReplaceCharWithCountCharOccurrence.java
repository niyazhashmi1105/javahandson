package com.java.programs;

import java.util.Arrays;

public class ReplaceCharWithCountCharOccurrence {

	public static void main(String[] args) {
		
		
		String str = "opentext";
		char charToReplace = 't';
		
		System.out.println(replaceCharWithCountCharOccurrence(str,charToReplace));

	}
	
	private static String replaceCharWithCountCharOccurrence(String str, char charToReplace) {
		
		if(str.indexOf(charToReplace)== -1) {
			System.out.println("Given Character not available in string");
			System.exit(0);
		}

		int cnt=1;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) == charToReplace) {
				str = str.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
				cnt++;
			}
				
		}
		return str;

		
	}

}
