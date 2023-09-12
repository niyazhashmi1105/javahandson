package com.java.programs;

public class RepeatingElement {

	public static void main(String[] args) {
		
		int []arr = {1,2,4,3,7,2,1};
		int []temp = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println(temp[arr[i]]);
			if(arr[i]==1)
				System.out.print(arr[i]+" ");
			else
				arr[i]++;
		}
	}

}
