package com.Junits;

public class StringFunctions {

	public static boolean isPallindrom(String str) {
		String reversestring="";
		for(int i=str.length()-1;i>=0;i--) {
		reversestring=reversestring+str.charAt(i);
		}
		if(reversestring.equalsIgnoreCase(str)) {
			//System.out.println("given String is pallindrome");
	        return true;
		}else {
			//System.out.println("given String is not a pallindrome");
			return false;
		}
}
}
