package com.java.programs;

public class BinarySearch {

	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5};
		int searchElement = 3;
		int index=binarySearch(arr,0,arr.length-1,searchElement);
		System.out.println("Element found at index "+index);
	}

	private static int binarySearch(int[] arr, int low, int high, int searchElement) {
		
		while(high >= low) {
			int mid = (low+high)/2;
			if(arr[mid]== searchElement)
				return mid;
			else if(searchElement > arr[mid])
				return binarySearch(arr,mid+1,high,searchElement);
			else
				return binarySearch(arr,low,mid-1,searchElement);
		}
		
		return -1;
	}

}
