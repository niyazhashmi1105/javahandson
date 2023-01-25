package com.java.programs;

public class CountCharacters {

	public static void main(String[] args) {
		String str= "Hello World selenium";
		getNumberOfCharactersCount(str);

	}

	private static void getNumberOfCharactersCount(String str) {
		
		char[]ch= str.toCharArray();
		String s="";
		for(int i=0;i<ch.length;i++) {
			
			while(i<ch.length && ch[i]!=' ') {
				s+=ch[i];
				i++;
			}
		}
			if(s.length()>0)
				System.out.println("Number of characters in the given string: "+s.length());
		}

}
