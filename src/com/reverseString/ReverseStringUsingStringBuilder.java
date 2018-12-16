package com.reverseString;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels=0;
		String str="javae";
		/*
		StringBuilder sb=new StringBuilder(str);
		
		String result=sb.reverse().toString();
		System.out.println(result);
		System.out.println("......");
		
		char[] ch=str.toCharArray();
		for(int i=str.length()-1; i>=0; i--){
			System.out.println(ch[i]);
			
			System.out.println("......");
				
			}
		*/
	
		for(int i=0; i<str.length(); ++i){
			char ch1=str.charAt(i);
			
			if(ch1=='a'|| ch1=='e'){
			 ++vowels;
			 System.out.println(ch1);
		}
			System.out.println(vowels);
		}

	}

}
