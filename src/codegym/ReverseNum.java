package codegym;

import java.util.Scanner;

/*Write a program that reads an integer from the keyboard (we assume that the number is greater than 0, no need to check).
Then reverses the entered number (0 is only considered at the end of the number), and displays the result on the screen.
Requirements:
•	The program must read one integer from the keyboard.
•	The program must display a reversed number on the screen.
*/

public class ReverseNum {

    public static void main(String[] args) {

	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	int result = reverseNum(num);
	System.out.println(result);
    }

    public static int reverseNum(int num) {
	int digit = 0;
	int rev = 0;
	while (num > 0) {
	    digit = num % 10;
	    rev = (rev * 10) + digit;
	    num = num / 10;
	}
	return rev;
    }

}
