package com.java.programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsApproaches {

	public static void main(String[] args) {
		int []arr= {1,2,3,1,4,5,6,7,7,8};
		bruteforce(arr);
		//extraMemory(arr);
	}

	private static void extraMemory(int[] arr) {
		Set<Integer> hset = new HashSet<Integer>();
		for(int a:arr) {
			if(hset.contains(a)) 
				System.out.println("Duplicate Elements= "+a);
			else
				hset.add(a);
		}
	}

	private static void bruteforce(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+",");
				}
			}
		}
		
	}

}
