import java.util.Scanner;

/*
 * Problem Statement: Find the length of a string without using length function
 */
public class LengthOfaString {

    public static void main(String[] args) {
	System.out.println(" enter the string  ");
	Scanner in = new Scanner(System.in);
	String name = in.nextLine();

	int len = LengthUsingChar(name);
	System.out.println("Length of the " + name + " is " + len);
	in.close();

    }

    @SuppressWarnings("unused")
    private static int LengthUsingChar(String name) {

	char[] namearray = name.toCharArray();

	int count = 0;
	// using length function
	// count = namearray.length;

	for (char ch : namearray) { // System.out.println(ch);
	    count++;
	}

	return count;
    }

}
