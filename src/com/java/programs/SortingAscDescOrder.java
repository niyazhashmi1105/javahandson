package com.java.programs;

import java.util.Arrays;
import java.util.Collections;

public class SortingAscDescOrder {

	public static void main(String[] args) {
		String []str= {"one","two","three","four"};
		System.out.println("Before Sorting");
		
		for(String s : str) {
			System.out.println(s);
		}
		System.out.println("After Sorting in Ascending Order");
		Arrays.sort(str);
		for(String s : str) {
			System.out.println(s);
		}
		
		System.out.println("After Sorting in Decending Order");
		Arrays.sort(str,Collections.reverseOrder());
		for(String s : str) {
			System.out.println(s);
		}

	}

}
