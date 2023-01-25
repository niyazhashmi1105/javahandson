package com.java.programs;

import java.util.Scanner;

public class MaximunDifference {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		n = sc.nextInt();
		int []arr = new int[n];
		
		System.out.println("Enter only positive elements in the Array");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		sc.close();
		int diff=getMaxDifference(arr);
		System.out.println("Maximun Difference= "+diff);

	}

	private static int getMaxDifference(int[] arr) {
		
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		
		return max-min;
	}

}
