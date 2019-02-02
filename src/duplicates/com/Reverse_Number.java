package duplicates.com;

public class Reverse_Number {

	public static void main(String[] args) {
		int num=1234;
		int reversedNumber=0;
		while(num!=0){
			int digit=num%10;
			reversedNumber=reversedNumber*10+digit;
			num/=10;
			}
		System.out.println("Reverse number is:"+ reversedNumber);

	}

}
