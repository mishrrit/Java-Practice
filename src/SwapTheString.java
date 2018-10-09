import java.util.Scanner;

public class SwapTheString {

	/*
	 * @Swap the String without using third variable
	 * @Swap the two string using temp variable
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println(" Enter the first string \n");
		Scanner in = new Scanner(System.in);
		String string1 = in.nextLine();

		System.out.println(" Enter the first string \n");
		Scanner in1 = new Scanner(System.in);
		String string2 = in1.nextLine();

		System.out.println("************************ Before Swapping ******************");
		System.out.println("Value of String1 is " + string1);
		System.out.println("Value of String2 is " + string2);
		SwapString(string1, string2);

		SwapUsingTemp(string1, string2);

	}

	private static void SwapUsingTemp(String string1, String string2) {
		String temp = string1;
		string1 = string2;
		string2 = temp;
		System.out.println("Swapping the variable without using temp variable *********");
		System.out.println("Value in String1 is " + string1);
		System.out.println("Value in String2 is " + string2);

	}

	private static void SwapString(String string1, String string2) {

		System.out.println("Swapping the variable without using temp variable *********");
		String str = string1 + string2;

		string1 = str.substring(str.length() - string2.length(), str.length());
		string2 = str.substring(0, str.length() - string2.length());

		System.out.println("Value in String1 is " + string1);
		System.out.println("Value in String2 is " + string2);

	}

}
