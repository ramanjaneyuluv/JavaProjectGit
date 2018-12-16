package com.reverseString;

import java.util.HashMap;
import java.util.Map;

public class RepeatedChars {

	public static void main(String[] args) {
		String str="i am good in program, but i am forgetting everything every day";
		char[] ch=str.toCharArray();
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		for(char value:ch){
			if(Character.isAlphabetic(value)){
				if(charMap.containsKey(value)){
					charMap.put(value, charMap.get(value)+1);
				}
				else{
					charMap.put(value, 1);
				}
			}
		}
		System.out.println(charMap);
System.out.println(".args...............");

String string="i am good";
int count=0;
char[] arr=string.toCharArray();
for(int i=0;i<string.length();i++){
	for(int j=i+1; j<string.length();j++){
		if(arr[i]==arr[j]){
			count++;
			break;
		}
		System.out.println(arr[j]+":"+count);
	}
}
	}

}
