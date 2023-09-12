package com.java.programs;

public class CountEachCharacterInWords {

public static void main(String[] args) {

		String str = "This is my java program";

		countWords(str);
	}

	public static void countWords(String str) 
	{ 
		
        char[] ch = str.toCharArray();
      
        for (int i = 0; i < ch.length; i++) {
        	String s = "";
           
        while (i < ch.length && ch[i] != ' ') {
        		s = s + ch[i];
                i++;
            }
 
            System.out.println(s + "->" + s.length());           
        }
	}



}
