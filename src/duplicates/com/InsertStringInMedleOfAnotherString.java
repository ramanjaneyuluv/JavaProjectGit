package duplicates.com;

import java.util.*;

import sun.text.normalizer.Replaceable;

public class InsertStringInMedleOfAnotherString {

	public static void main(String[] args) {

		/*String main_String="Python 3.0";
		String word="Tutorial";
		System.out.println(main_String.substring(0,7)+word+main_String.substring(6));
		*/
		/*String s="hello world";
		String b="the";
		System.out.println(b+" "+s.substring(5));
	
		*/
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the first sentence:");
		String s=ob.nextLine();
		
		System.out.println("Enter the replacing word:");
		String replace=ob.next();
		System.out.println("Enter the new word");
		
		String replacingWith=ob.next();
		s=s+" ";
		String newSen=" "; String temp="";
		for(int i=0; i<s.length();i++)
		{
			char x=s.charAt(i);
			if(x!=' '){
				temp=temp+x;
			}else if(replace.equals(temp)){
					newSen=newSen+replacingWith;
				}
				else{
					newSen=newSen+temp;
			}
			newSen=newSen+" ";
			temp="";
		}
		
		System.out.println(newSen);
	}

}
