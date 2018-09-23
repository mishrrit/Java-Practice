import java.util.Scanner;

/*
 Consider a staircase of size :

   #
  ##
 ###
####
Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Input Format

A single integer, , denoting the size of the staircase.

Output Format

Print a staircase of size  using # symbols and spaces.

Note: The last line must have 0 spaces in it.

Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .
 */

public class StairCase {

	static void staircase(int n) {
       int k=0,j=1;
		for(int i=n;i>0;i--) {
		 for(j=1;j<i;j++) {
			 System.out.print(" ");
			 
		 }
		 
		
		 if(j==1) {
			 k=0;
		 }else {
			 k=j-1;
		 }
		 
		 while(n-k>0) {
		 System.out.print("#");
		 k++;
		 }
		 System.out.println("");
			
		}
        
    }

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }

}
