package com.java.programs;

public class WordsReverseFirstLetterCapitalize {

	public static void main(String[] args) {
		
		
		String str="Selenium Java Automation";
		String revWord="";
		StringBuilder resultBuilder = new StringBuilder();
		
		for(String w:str.split(" ")) {
			
			StringBuilder builder = new StringBuilder(w.toLowerCase());
			
			revWord = builder.reverse().toString();
			revWord = Character.toUpperCase(revWord.charAt(0))+revWord.substring(1);
			resultBuilder.append(revWord).append(" ");
			
		}
		System.out.println(resultBuilder.toString());
	}

}
