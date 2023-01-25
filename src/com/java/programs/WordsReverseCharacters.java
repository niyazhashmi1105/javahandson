package com.java.programs;

public class WordsReverseCharacters {

	public static void main(String[] args) {
		String s =" automation Testing by Selenium";
		
		String[] word= s.split(" ");
		String reverseWord = "";
		
		for(String w:word) {
			StringBuilder builder = new StringBuilder(w);
			reverseWord+=builder.reverse().toString()+" ";
		}
		System.out.println("Words in reverse order= "+reverseWord);

	}

}
