package com.java.programs;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		
		int []originalArr = {1,2,3,4,5};
		int [] newArray= new int[originalArr.length-1];
		
		System.out.println("Original Array: "+ Arrays.toString(originalArr));
		System.out.println("Enter the index location to delete the element at:");
		
		int index=2;
		if(index>originalArr.length)
		System.out.println("Please enter valid index");
		
		for(int i=0,k=0;i<originalArr.length;i++) {
			if(index==i) {
				continue;
			}
			newArray[k++]= originalArr[i];
		}
		System.out.println("New Array: "+Arrays.toString(newArray));

	}

}
