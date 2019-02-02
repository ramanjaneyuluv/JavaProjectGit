package patterans;

public class Pyramid {
	public static void main(String[] args) {
		int rows = 5, k = 0;
//Program to print full pyramid a using *
        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
        //Program to print half pyramid a using numbers
          //  int rows = 5;

        System.out.println("...........");
        int numStar=5;
            for(int i = 1; i <= numStar; ++i) {
                for(int j = 1; j <= i; ++j) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            System.out.println("...........");
		
        //Inverted half pyramid using numbers
        //int rows = 5;

        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("...........");
        
		//for symbols making pyramid   
		//int rows = 5;
	        for(int i = 1; i <= rows; ++i) {
	            for(int j = 1; j <= i; ++j) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        

	        System.out.println("...........");
	//for Alphabets
		  char last = 'E', alphabet = 'A';

	        for(int i = 1; i <= (last-'A'+1); ++i) {
	            for(int j = 1; j <= i; ++j) {
	                System.out.print(alphabet + " ");
	            }
	            ++alphabet;
	            System.out.println();
	        }

	        System.out.println("...........");
	        //Inverted half pyramid using *

	        for(int i = rows; i >= 1; --i) {
	            for(int j = 1; j <= i; ++j) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	}
}