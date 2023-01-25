package com.java.programs;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {9,-1,7,0,5,1,6,-2};
		System.out.println("Before Sorting");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
		bubbleSort(arr);
		
		System.out.println("\nAfter Sorting");
		for(int i: arr) {
			System.out.print(i+" ");
		}

	}
	
	private static void bubbleSort(int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
