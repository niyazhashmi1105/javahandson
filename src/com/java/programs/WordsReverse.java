package com.java.programs;

public class WordsReverse {

	public static void main(String[] args) {
		
		String s =" Welcome to Java World";
		
		String [] word= s.split(" ");
		System.out.println("Words in reverse order");
		for(int i=word.length-1;i>0;i--) {
			System.out.println(word[i]);
		}

	}

}
