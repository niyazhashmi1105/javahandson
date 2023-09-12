package com.java.programs;

import java.util.LinkedHashMap;
import java.util.Map;


public class WordVowelUpperCaseFrequencyCount {

	public static void main(String[] args) {

		String str= "Learn with Java";
		getWordCount(str);
		getVowelCount(str);
		getUpperCaseCount(str);
		getFrequencyCharacterCount(str);

	}

	private static void getFrequencyCharacterCount(String str) {
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			Integer ch= map.get(str.charAt(i));
			
			if(map.get(str.charAt(i))== null){
				map.put(str.charAt(i), 1);
			}
			else {
				map.put(str.charAt(i), ++ch);
			}
			
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			System.out.println("Character= "+entry.getKey()+" "+
			"Frequency= "+entry.getValue());
			
		}
		
	}

	private static void getUpperCaseCount(String str) {
		
		int upperCaseCount=0;
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			if(ch>=65 && ch<=90) 
				upperCaseCount++;
			
		}
		System.out.println("Upper case Count= "+upperCaseCount);
		
	}

	private static void getVowelCount(String str) {
		
		str = str.toLowerCase();
		int vowelCount=0;
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
					vowelCount++;
					break;
			}
		}
		System.out.println("VowelCount= "+vowelCount);
		
	}

	private static void getWordCount(String str) {
		
		int wordCount=0;
		String[]word= str.split(" ");
		
		for(int i=0;i<word.length;i++) {
			wordCount++;
		}
		System.out.println("WordCount= "+wordCount);
		
	}

}
