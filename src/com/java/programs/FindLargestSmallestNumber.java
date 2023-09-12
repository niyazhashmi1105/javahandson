package com.java.programs;

public class FindLargestSmallestNumber {

	public static void main(String[] args) {
	
		int []arr= {-6,49,66,999,2,6,9};
		int largest= Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		System.out.println("MIN VALUE: "+Integer.MIN_VALUE);
		System.out.println("MAX VALUE: "+Integer.MAX_VALUE);
		
		for(int num: arr) {
			if(num>largest)
				largest= num;
		}
		System.out.println("Largest Number = "+largest);
		
		for(int num: arr) {
			if(num<smallest)
				smallest= num;
		}
		System.out.println("Smallest Number = "+smallest);

	}

}
