package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap<>();
		int []arr= {10,20,30,40,30,30};
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()> arr.length/2) {
				int result = entry.getKey();
				System.out.println(result);
			}
		}
		
		
		
		

	}

}
