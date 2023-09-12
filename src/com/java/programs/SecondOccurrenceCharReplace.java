package com.java.programs;

public class SecondOccurrenceCharReplace {

	public static void main(String[] args) {

		String str= "Tomorrow";
		int index = str.indexOf('o');
		//System.out.println(index);
		int first=str.indexOf('o',str.indexOf('o')+1);
		//int first = str.lastIndexOf('o',str.indexOf('o')+1);
	    StringBuilder sb = new StringBuilder(str); 
	    sb.setCharAt(first, '$'); 
	    System.out.println(sb);

	}

}
