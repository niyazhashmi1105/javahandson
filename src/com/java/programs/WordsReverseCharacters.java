package com.java.programs;

public class WordsReverseCharacters {

	public static void main(String[] args) {
		String s =" automation Testing by Selenium";
		
		String[] word= s.split(" ");
		String reverseWord = "";
		
		System.out.println("Words in reverse order");
		
		for(String w:word) {
			StringBuilder builder = new StringBuilder(w);
			reverseWord = reverseWord+builder.reverse().toString()+" ";
			
		}
		System.out.println(reverseWord);

		String []splitStr = reverseWord.split(" ");
		for(int i=splitStr.length-1;i>=0;i--) {
			System.out.print(splitStr[i]+" ");
		}
	}

}
