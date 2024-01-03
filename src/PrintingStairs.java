import java.util.Scanner;

public class PrintingStairs {

    public static void main(String[] args) {

	System.out.println(" Enter the String \n");

	Scanner in = new Scanner(System.in);
	String inputString = in.next();

	getLeftStairs(inputString);
	getRightStairs(inputString);
	in.close();
    }

    private static void getRightStairs(String inputString) {
	char[] array = inputString.toCharArray();
	System.out.println("*********** Right Stairs**********");
	int len = array.length;
	for (int i = 0; i < len; i++) {

	    for (int j = 0; j < len; j++) {

		if (i < j) {
		    break;

		} else {
		    System.out.print(array[j]);
		    // System.out.print(" ");
		}
	    }
	    System.out.println("");

	}

    }

    private static void getLeftStairs(String inputString) {

	System.out.println("********* Left Stairs**********");
	char[] array = inputString.toCharArray();

	int len = array.length;
	for (int i = 0; i < len; i++) {

	    for (int j = 0; j < len; j++) {

		if (len - (i + j) - 1 > 0) {
		    System.out.print(" ");
		} else {
		    System.out.print(array[j]);
		}
	    }
	    System.out.println("");

	}
    }

}
