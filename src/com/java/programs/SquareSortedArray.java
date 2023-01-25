package com.java.programs;

public class SquareSortedArray {

	public static void main(String[] args) {
		
		int []arr= {-6,-1,2,9,5};
		int []squareSorted=getSquareSortedArray(arr);
		for(int i=0;i<squareSorted.length;i++) {
			System.out.print(squareSorted[i]+" ");
		}
		
	}

	private static int[] getSquareSortedArray(int[] arr) {
		
		int []squareSorted = new int[arr.length];
		int start=0;
		int end=arr.length-1;
		int squareIndex= arr.length-1;
		
		while(start<=end) {
			
			if(arr[start]*arr[start]>arr[end]*arr[end]) {
				squareSorted[squareIndex--]= arr[start]*arr[start];
				start++;
			}
			else {
				squareSorted[squareIndex--]= arr[end]*arr[end];
				end--;
			}
			
		}
				
		return squareSorted;
		
	}

}
