package com.java.programs;

public class NegativeNumbersLeftMoving {

	public static void main(String[] args) {
		
		int [] arr= {-4,-2,3,1,7,-9,10,-1};
		int [] newArr= new int[arr.length];
		
		System.out.println("Original Array");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		reArrangeNegativeNumbers(arr,newArr);
		System.out.println("\nMoving Negative elements at the begining of the array");
		print(newArr);

	}

	private static void print(int[] newArr) {
		
		for (int i : newArr) {
			System.out.print(i+" ");
		}
		
		
	}

	private static void reArrangeNegativeNumbers(int[] arr, int[] newArr) {
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		
	
	}
}
