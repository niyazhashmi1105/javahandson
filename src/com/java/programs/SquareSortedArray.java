package com.java.programs;

public class SquareSortedArray {

	public static void main(String[] args) {
		
		int [] arr= {-6,-1,2,9,5};
		int [] squared=getSquareArray(arr);
		printArr(squared);
	}

	private static int[] getSquareArray(int[] arr) {
		
		int []squared = new int[arr.length];
		int start=0;
		int end=arr.length-1;
		int squareIndex= arr.length-1;
		
		while(start<=end) {
			
			if(arr[start]*arr[start]>arr[end]*arr[end]) {
				squared[squareIndex--]= arr[start]*arr[start];
				start++;
			}
			else {
				squared[squareIndex--]= arr[end]*arr[end];
				end--;
			}
			
		}
		return sortedArray(squared);	
	
	}
	
	private static int[] sortedArray(int []arr) {
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
	private static void printArr(int [] arr) {

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
