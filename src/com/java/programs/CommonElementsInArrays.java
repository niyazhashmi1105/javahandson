package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsInArrays {

	public static void main(String[] args) {
		
		Integer []arr1= {1,2,3,4,5,6};
		Integer []arr2= {0,-1,3,9,8,6};
		Integer []arr3= {1,5,9,10,2};
		
		
		Set<Integer> set= new HashSet<>();
		set.addAll(Arrays.asList(arr1));
		set.addAll(Arrays.asList(arr2));
		set.addAll(Arrays.asList(arr3));
		List<Integer> finalList = new ArrayList<>();
		
		for(Integer number: set) {
			if((Arrays.asList(arr1).contains(number) && Arrays.asList(arr2).contains(number))||(Arrays.asList(arr2).contains(number) && Arrays.asList(arr3).contains(number))
				||(Arrays.asList(arr1).contains(number) && Arrays.asList(arr3).contains(number))) {
				finalList.add(number);			}
				
		}
		
		System.out.println("Common Elements in given arrays "+ finalList);
		
		
		
		
		
	}

}
