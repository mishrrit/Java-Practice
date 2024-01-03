package codegym;
/*
 Problem: Write a program that reads one integer from the keyboard.
	If the number consists of three digits, then you need to display the sum of the digits of the number. 
	If it consists of two — the product of digits, if it's one digit — display the number.
	In all other cases, do not output anything.
Requirements:
The program must read one integer from the keyboard.
The program should display the sum of the digits of the read number, if it is three-digit.
The program should display the product of the digits of the read number, if it is two-digit.
The program should display the read number if it is single digit.
The program should not display anything if the read number has more than three digits.

i/p:153
o/p: 9

i/p: 15
o/p: 5

i/p: 1
o/p: 1
*/

import java.util.Scanner;

public class ConditionsIfStatements {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	int orig = num;
	int sum = 0;
	int i = 0;
	int prod = 1;
	int digit = 0;
	while (num > 0) {
	    digit = num % 10;
	    sum = sum + digit;
	    prod = prod * digit;
	    num = num / 10;
	    i++;
	}

	if (i == 1 || orig == 0) {
	    System.out.println(orig);
	} else if (i == 2) {
	    System.out.println(prod);
	} else if (i == 3) {
	    System.out.println(sum);
	}
    }

}
