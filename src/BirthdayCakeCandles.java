import java.util.Scanner;

/*
 You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles,
  she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.

For example, if your niece is turning 4 years old, and the cake will have 4 candles of height 3,2,1 ,3 she will be able to blow out 2  candles successfully,
 since the tallest candle is of height 3 and there are 2 such candles.

Complete the function birthdayCakeCandles that takes your niece's age and an integer array containing height of each candle as input, and return the number of candles she can successfully blow out.

Input Format

The first line contains a single integer,n , denoting the number of candles on the cake. 
The second line contains n space-separated integers, where each integer i  describes the height of candle i .

Constraints
1<=n <= 10 is to the power of 5
1<=h <= 10 is to the power of 7

Output Format

Print the number of candles the can be blown out on a new line.

Sample Input 0

4
3 2 1 3
Sample Output 0

2
Explanation 0

We have one candle of height , one candle of height , and two candles of height . Your niece only blows out the tallest candles, meaning the candles where . Because there are  such candles, we print on a new line.
 */
public class BirthdayCakeCandles {

	static int birthdayCakeCandles(int n, int[] ar) {

		int extra =0;
		for(int k=0;k<ar.length;k++) {
			for(int j=0;j<ar.length-k-1;j++) {
				if(ar[j]<ar[j+1]) {
					extra =(int) ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=extra;

				}
			}
		}
		int temp =0;
		int count =0;

		for(int k=0;k<n;k++) {
			temp =ar[0];
			/*if(k+1>n-1) {
				break;
			}*/
			if(ar[k]==0) {
				break;
			}
			if(temp==ar[k]) {

				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
	}

}
