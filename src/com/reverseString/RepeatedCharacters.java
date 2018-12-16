package com.reverseString;

public class RepeatedCharacters {

	public static void main(String[] args) {
		
		//Typr-1
		String str = "w3schoolsnnbb";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]+""+cnt);
		     cnt++;
		     break;
		    }
		   }
		  }
		  //type-2
		  int count=0;
		   String t="";
		   String st="i am very good boy in my class";
		   for(int k=0;k<st.length()-1; k++){
			   for(int m=k+1;m<st.length();m++){
				   if(st.charAt(k)==st.charAt(m)&&!t.contains(st.charAt(m)+"")){
					   t=t+st.charAt(k);
				   }
			   }
		   }
		   System.out.println(t);
	}

}
