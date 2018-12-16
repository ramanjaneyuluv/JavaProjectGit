package com.maxnumbers;

public class MaxNumber {
	
     static double arr[]={10,20,60,89.9,555%2.2, 100.5};

     //Type=1
       static double largest()
      {
      double max=arr[0];
      for(int i=1; i<arr.length; i++){
	   if(arr[i]>max)
		max=arr[i];
        }
      return max;
      }
       
       //Type=2
       static int MaxValue(int[] number){
    	   int currentHighestValue=Integer.MIN_VALUE;
    	   for(int i=0; i<number.length; i++)
    	   {
    		   int value=number[i];
    		   if(value>currentHighestValue)
    			   currentHighestValue=value;
    	   }
    	   return currentHighestValue;
       }
      public static void main(String[] args){
    	  int a[]={56,89,58,90,56,54};
	  System.out.println("Max number is:"+MaxValue(a));
	  
	  int b=Integer.max(6, 8);
	  System.out.println(b);
	  int c=Integer.min(2, 5);
	  System.out.println(c);
	  
    }

    }
