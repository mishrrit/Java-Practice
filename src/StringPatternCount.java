
/****
 * @author mishrrit
 * Description: Count the pattern in a given string 
 * For example: aaabbbccdddddaabb should return a3 b3 c2 d4 a2 b2
 ****/

import java.util.Scanner;

public class StringPatternCount {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println(" Enter the given pattern of String \n");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		PatternCheck(str);
	}

	private static void PatternCheck(String str) {

		char[] strarray = str.toCharArray();
		int count = 1;
		int j = 0;
		for (int i = 0; i < strarray.length;) {
			i = j;
			count = 1;
			for (j = i + 1; j < strarray.length; j++) {
				if (strarray[i] == strarray[j]) {
					count++;
				} else {
					break;
				}
			}
			if (i < strarray.length) {
				System.out.print(strarray[i] + "" + count + " ");
			} else {
				break;
			}
		}

	}

}
