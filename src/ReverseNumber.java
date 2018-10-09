import java.util.Scanner;

public class ReverseNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println(" Enter the number ");
		Scanner in = new Scanner(System.in);
		String sys = in.nextLine();

		ReverseTheNumber(sys);

	}

	private static void ReverseTheNumber(String sys) {

		int num = Integer.parseInt(sys);
		int numarray = 0;
		int dig =0;

		while(num>0) {
			numarray = num % 10;
			dig =num/10;
			num =dig;
			System.out.print(numarray);
		}	

	}
}
