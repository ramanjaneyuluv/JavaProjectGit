package com.maxnumbers;

public class TwoDArrayHighestNumber {
	
	public static double findHighestValue(double[][] doubles){
		double currentHighestValue=Double.MIN_VALUE;
		for(int row=0; row<doubles.length; row++)
		{
			for(int col=0; col<doubles[row].length; col++)
			{
				double value=doubles[row][col];
				if(value>currentHighestValue)
				{
					currentHighestValue=value;
				}
			}
		}
		return currentHighestValue;
	}

	public static void main(String[] args) {
		 double num[][]={{10,20},{58,89,86}};
		System.out.println("Largest number is:"+findHighestValue(num));

	}

}
