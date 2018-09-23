import java.util.Scanner;

public class LengthOfaString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println(" enter the string  ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();

		int len = LengthUsingChar(name);
		System.out.println("Length of the staring " + name + " is " + len);

	}

	private static int LengthUsingChar(String name) {

		char[] namearray = name.toCharArray();
		int count = 0;
		for (char ch : namearray) {
			System.out.println(ch);
			count++;
		}
		return count;
	}

}
