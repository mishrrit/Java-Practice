package hackersRank;

/*
 * Given a number n, for each integer i in the range from 1 to n inclusive, print one value per line as below
 * If i is a multiple of both 3 and 5, print FizzBuzz
 * If i is a multiple of 3 but not 5, print Fizz
 * If i is a multiple of 5 but not 3, print Buzz
 * If i is not a multiple of 4 or 5, print the value of i.
 * 
 * int n: upper limit inclusive
 * Returns None
 * 
 * Constraints
 * 0 < n <2*10^5
 * 
 * Sample case
 * Input : 15
 * 
 * 1
 * 2
 * Fizz
 * 4
 * Buzz
 * Fizz
 * 7
 * 8
 * Fizz
 * Buzz
 * 11
 * Fizz
 * 13
 * 14
 * FizzBuzz
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(bufferedReader.readLine().trim());
	FizzBuzz.fizzBuzz(n);
	bufferedReader.close();

    }

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {

	for (int i = 1; i <= n; i++) {
	    if (i == 1 || i == 2) {
		System.out.println(i);
	    } else if (i % 3 == 0 && i % 5 == 0) {
		System.out.println("FizzBuzz");
	    } else if (i % 5 == 0 && i % 3 != 0) {
		System.out.println("Buzz");
	    } else if (i % 5 != 0 && i % 3 == 0) {
		System.out.println("Fizz");
	    } else {
		System.out.println(i);
	    }
	}
    }

}
