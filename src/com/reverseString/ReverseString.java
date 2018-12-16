package com.reverseString;

public class ReverseString {

	public static void main(String[] args) {
		String str="i am good boy";
		String reversestr="";
		
		char[] ch=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			reversestr=reversestr+str.charAt(i);
			
		}
		System.out.println(reversestr);
		
		
	}

}
