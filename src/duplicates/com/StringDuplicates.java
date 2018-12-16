package duplicates.com;

public class StringDuplicates {
	public static void main(String[] args){
		String abc="I love my country";
		int count=0;
		
		abc.toLowerCase();
		for(int i=0; i<abc.length(); i++)
		{
			char[] ch=abc.toCharArray();
			//System.out.println(ch[i]);
			for(int j=i+1; j<abc.length(); j++){
				if(ch[i]==ch[j])
				{
					  System.out.println(ch[j]+".."+count);
					count++;
				}
			}
		}
	}

}
