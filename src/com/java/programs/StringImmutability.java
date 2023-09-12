package com.java.programs;

public class StringImmutability {

	public static void main(String[] args) {
		
		String s1= "niyaz";
		String s2= "hashmi";
		//s1.concat("hashmi");
		//System.out.println(s1);
		System.out.println(merge(s1,s2));
		}

	private static String merge(String s1, String s2) {
		
		String output="";
		output = s1.concat(s2);
		
		return output;
		
	}

}
