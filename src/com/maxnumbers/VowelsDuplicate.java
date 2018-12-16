package com.maxnumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class VowelsDuplicate {

	public static void main(String[] args) throws Exception {
		String line="Hey, I am doing very good work";
		int vowels=0;
		line=line.toLowerCase();
		
		char[] ch=line.toCharArray();
		for(int i=0; i<line.length(); i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
				System.out.println(ch[i]);
				vowels++;
			}	
		}
		System.out.println("Duplicate vowels are:"+vowels);

	}

}
