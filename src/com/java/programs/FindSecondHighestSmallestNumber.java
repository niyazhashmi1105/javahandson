package com.java.programs;

public class FindSecondHighestSmallestNumber {

	public static void main(String[] args) {
		
		int []arr1= {4,2,25,1,0};
		int []arr2= {45,22,250,10,3,2};
		
		System.out.println("Second Smallest Number= "+getSecondSmallestNumber(arr1,arr1.length));
		System.out.println("Second Largest Number= "+getSecondHighestNumber(arr2,arr2.length));
}
	
	private static int getSecondSmallestNumber(int[]arr,int n) {
		
		int temp;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(arr[i]< arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
			}
			}
		}
		
		return arr[n-2];
	}
	
	private static int getSecondHighestNumber(int[]arr,int n) {
		
		int temp;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(arr[i]> arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
			}
			}
		}
		
		return arr[n-2];
	}

}
