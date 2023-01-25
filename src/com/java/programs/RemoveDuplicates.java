package com.java.programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str="aaabcbcbcddcccb";
		System.out.println(removeDuplicateCharacters(str));

	}
	
	private static String removeDuplicateCharacters(String str) {
		
		Set<Character> set = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			Character ch = str.charAt(i);
			if(!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
