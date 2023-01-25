package com.java.programs;

public class MissingNumber {

	public static void main(String[] args) {
	
		int []arr = {1,2,3,4,5,6,7,8,10};
		int missingNumber=getMissingNumber(arr,arr.length+1);
		System.out.println("Missing Number= "+ missingNumber);

	}

	private static int getMissingNumber(int[] arr, int n) {
		
		int expectedSum,actualSum=0;
		expectedSum= (n*(n+1)/2);
		for(int i:arr) {
			actualSum+=i;
		}
		return expectedSum-actualSum;
		
		
		
		
	}

}
