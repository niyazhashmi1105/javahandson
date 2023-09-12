package com.java.programs;

import java.util.Arrays;

public class SortingAlphabets {

	public static void main(String[] args) {
		
		//Input : String str=”Input : String str=”My name is Rajat”;”;
		
		String str ="My name is Niyaz";
		
		String lc=str.toLowerCase();
		char [] ch = lc.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] > ch[j] && ch[i]!=' '){
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(ch));

	}

}
