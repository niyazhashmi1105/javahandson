package com.java.programs;

public class RepeatingElement {

	public static void main(String[] args) {
		
		int []arr = {1,2,4,3,2,5,1};
		int []temp = new int[arr.length];
		
		for(int i=0;i<temp.length;i++) {
			if(temp[arr[i]]==1)
				System.out.print(arr[i]+" ");
			else
				temp[arr[i]]++;
		}

	}

}
