package com.java.programs;

public class StringImmutability {

	public static void main(String[] args) {
		
		String s1= "niyaz";
		s1.concat("hashmi");
		System.out.println(s1);
		//System.out.println(merge(s1,s2));
		}

	private static String merge(String s1, String s2) {
		
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<s1.length()||i<s2.length();i++) {
			
			if(i<s1.length())
				builder.append(s1.charAt(i));
			
			if(i<s2.length())
				builder.append(s2.charAt(i));
				
			}
		
		return builder.toString();
		
	}

}
