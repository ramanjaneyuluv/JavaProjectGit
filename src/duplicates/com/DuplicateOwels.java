package duplicates.com;

public class DuplicateOwels {

	public static void main(String[] args) {

		String abc="I Love My country";
		int vowels=0, consonants=0, digits=0, spaces=0;
		abc=abc.toLowerCase();
		//char ch[]=abc.toCharArray();
		for(int i=0; i<abc.length(); i++){
			char ch=abc.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

				++vowels;
				System.out.println(ch);
			}
			else if((ch>'a')&&(ch<='z'))
			{
				consonants++;
				System.out.println(consonants);
			}else if(ch>=0&&ch<9){
				digits++;
			}
			else if(ch==' '){
				spaces++;
			}
					}
		System.out.println("vowels are:"+vowels);
		System.out.println("Cosonants"+consonants);
		System.out.println("Digits"+digits);
		System.out.println("spaces"+spaces);
		
		
	}

}
