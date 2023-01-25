package com.java.programs;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		
		System.out.println("Array before Left Rotation");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter how many time you want to left rotate an array");
		int pos= sc.nextInt();
		leftRotate(arr, pos);
		
		
		System.out.println("Array after Left Rotation");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		rightRotate(arr, pos);
		System.out.println("\nArray after Right Rotation");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

	private static void leftRotate(int[] arr, int pos) {
		
		int temp;
		int j;
		
		for(int i=0;i<pos;i++) {
				temp = arr[0];
		for(j=0;j<arr.length-1;j++) {
				arr[j]= arr[j+1];
		}
		arr[j]= temp;
		}
	}
	
private static void rightRotate(int[] arr, int pos) {
		
		int temp;
		int j;
		
		for(int i=0;i<pos;i++) {
				temp = arr[arr.length-1];
		for(j=arr.length-1;j>0;j--) {
				arr[j]= arr[j-1];
		}
		arr[0]= temp;
		}
	}

}
