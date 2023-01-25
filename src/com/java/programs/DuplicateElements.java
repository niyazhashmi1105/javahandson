package com.java.programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String []str= {"java","python","python","selenium","c","java"};
		
		Set<String> nonDuplicateSet = new HashSet<>();
		Set<String> duplicateSet = new HashSet<>();
		
		for(String s: str) {
			
			if(!nonDuplicateSet.contains(s))
				nonDuplicateSet.add(s);
			else
				duplicateSet.add(s);
		}
		System.out.println("Duplicate Elements = "+duplicateSet);
	}

	
	
}
