package com.java.programs;

import java.util.Arrays;

public class MovingZeroesEndOfArray {

	public static void main(String[] args) {
		
		int [] arr= {0,0,3,1,7,0,10,0};
		int [] newArr= new int[arr.length];
		
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));
		
		reArrange(arr,newArr);
		System.out.println("\nMoving zeroes to the end of the array");
		print(newArr);

	}

	private static void print(int[] newArr) {
		
		for (int i : newArr) {
			System.out.print(i+" ");
		}
		
		
	}

	private static void reArrange(int[] arr, int[] newArr) {
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				newArr[j] = arr[i];
				j++;
			}
		}
}

}
