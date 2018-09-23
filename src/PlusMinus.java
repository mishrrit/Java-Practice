/*Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667
*/

import java.util.Scanner;

public class PlusMinus {

	static void plusMinus(int[] arr) {
        int ArrayLen = arr.length;
        float Pos = 0,Neg = 0,zeero =0;
            for(int i=0;i<ArrayLen;i++) {
        	if(arr[i]==0) {
        		zeero++;
        	   	}else if(arr[i]>0) {
        	   		Pos++;
        	   	}else {
        	   		Neg++;
        	   	}
        }
        System.out.println(Pos/ArrayLen);
        System.out.println(Neg/ArrayLen);
        System.out.println(zeero/ArrayLen);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sys = in.nextLine();
        char c =in.next().charAt(0);
        float abc = in.nextFloat();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }

}
