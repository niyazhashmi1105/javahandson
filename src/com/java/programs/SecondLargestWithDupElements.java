package com.java.programs;

public class SecondLargestWithDupElements {

	public static void main(String[] args) {

		  int[] numbers =  {2,4, 6, 3, 6, 5};
		
		System.out.println(getSecondLargestNum(numbers));
	}
	
	private static int getSecondLargestNum(int [] num) {
		
		int largest = Integer.MIN_VALUE +1;
		int secondLargest = Integer.MIN_VALUE;
		
		System.out.println(largest+" "+secondLargest);
		
		for(int i: num) {
				
			if(i> largest) {
					secondLargest = largest;
					largest = i;
			}
			else if(i> secondLargest && i!= largest) {
				secondLargest = i;
			}
		}
		return secondLargest;
	}
}
