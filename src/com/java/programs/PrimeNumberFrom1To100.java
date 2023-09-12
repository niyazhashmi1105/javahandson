package com.java.programs;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFrom1To100 {

	public static void main(String[] args) {

		List<Integer> list= getPrimeNumbers(100);
		System.out.println(list);
	}
	
	private static List<Integer> getPrimeNumbers(int n) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			int c=0;
			
			for(int j=1;j<=n;j++) {
				
				if(i%j==0) 
					c++;
			 }
		 if(c==2) 
			list.add(i);
		 else
			 continue;
		}
		return list;
	
	}
}

