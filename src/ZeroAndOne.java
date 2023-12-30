import java.util.Scanner;

public class ZeroAndOne {

	public static void main(String args[]) {
		
		System.out.println(" Enter the input string \n");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		System.out.println(SegregateZero(str));

	}

	public static char[] SegregateZero(String str) {

		char chararray[] = str.toCharArray();

		int len = str.length();
		int countofzero = 0;
		for (int i = 0; i < len; i++) {
			if (chararray[i] == '0') {
				countofzero++;
			}
		}
		
		for (int i = 0; i < len; i++) {
			if (i < countofzero) {
				chararray[i] = '0';
			} else {
				chararray[i] = '1';
			}
		}

		return chararray;

	}
	
	

}
