package com.java.programs;

public class CheckIfRotated {

	public static void main(String[] args) {
		
		String str= "bcd";
		String rotatedStr= "bcd";
		System.out.println(isRotated(str,rotatedStr));
	}

	private static boolean isRotated(String str, String rotatedStr) {
		
		if(str== null || rotatedStr==null)
			return false;
		else if(str.length()!= rotatedStr.length())
			return false;
		else  {
			 	String concatStr = str+str;
			  return concatStr.contains(rotatedStr);
		}
			
	}

}
