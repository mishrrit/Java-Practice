
/****
 * @author mishrrit
 * Description: Find the number of repeating characters in a string 
 * For example : sheep will give s1 h1 e2 p1 * 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class characterCount {

	public static void main(String[] args) {

		System.out.println(" Enter the Input String \n");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		CountChar(str.toLowerCase());

		CountCharusingMap(str.toLowerCase());
	}

	private static void CountCharusingMap(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] str1 = str.toCharArray();

		for (Character ch : str1) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		System.out.println(map);

	}

	private static void CountChar(String str) {

		char[] name = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			char contains = name[i];
			if (i + 1 > str.length()) {
				break;
			} else {
				for (int j = i + 1; j < str.length(); j++) {
					if (contains == name[j] && name[j] != '0') {
						count++;
						name[j] = '0';
					}
				}
			}
			if (name[i] != '0') {
				System.out.println("Count of " + name[i] + " is " + count);
			} else {
				continue;
			}
		}

	}
}
