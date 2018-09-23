import java.util.Scanner;

/*
 Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range .
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

Our initial numbers are 1,2 3,4 and 5. We can calculate the following sums using four of the five integers:

If we sum everything except 1, our sum is 2+3+4+5 =14.
If we sum everything except 2, our sum is 1+3+4+5 =13.
If we sum everything except 3, our sum is 1+2+4+5=12.
If we sum everything except 4, our sum is 1+2+3+5=11.
If we sum everything except 5, our sum is 1+2+3+4 =10.
As you can see, the minimal sum is 10 and the maximal sum is 14. Thus, we print these minimal and maximal sums as two space-separated integers on a new line.

Hints: Beware of integer overflow! Use 64-bit Integer.
 */
public class MinMaxSum {

	static void miniMaxSum(int[] arr) {
		long[] sum =new long[5];

		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				if(i!=j) {
					sum[i]=sum[i] + arr[j];

				}

			}
		}

		long extra=0;
		for(int k=0;k<sum.length;k++) {
			for(int j=0;j<sum.length-k-1;j++) {
				if(sum[j]<sum[j+1]) {
					extra =(int) sum[j];
					sum[j]=sum[j+1];
					sum[j+1]=extra;

				}
			}
		}

		System.out.println(sum[sum.length-1]+" "+sum[0]);




	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for(int arr_i = 0; arr_i < 5; arr_i++){
			arr[arr_i] = in.nextInt();
		}
		miniMaxSum(arr);
		in.close();
	}

}
