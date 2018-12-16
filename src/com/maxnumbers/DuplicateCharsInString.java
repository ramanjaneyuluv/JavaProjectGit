package com.maxnumbers;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		String line="Hai, How are you?";
		int count=0;
		line=line.toLowerCase();
		char ch[]=line.toCharArray();
		for(int i=0; i<line.length();i++)
		{
			for(int j=i+1; j<line.length(); j++)
			{
				if(ch[i]==ch[j])
					System.out.println(ch[j]);
					count++;
			}
		}
		System.out.println("Duplicate are:"+count);

	}

}
