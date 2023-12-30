import java.util.Scanner;

public class RemovecharfromString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Enter the given string \n");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		System.out.println(" Enter the Character to be removed \n");
		Scanner inc = new Scanner(System.in);
		char ch = inc.next().charAt(0);

		// Using code logic
		RemoveCharFirstOcurrence(str, ch);
		RemoveCharMultipleOcurrence(str, ch);
		RemoveCharLastOcurrence(str, ch);
	}

	private static void RemoveCharLastOcurrence(String str, char ch) {
		char charArray[] = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ch) {
				while (i < charArray.length - 1) {
					charArray[i] = charArray[i + 1];
					i++;
				}
			}
		}

		System.out.println("Remove the character " + ch + " from last \n");
		str = str.substring(0, charArray.length - 1);

		System.out.println(str);

	}

	private static void RemoveCharMultipleOcurrence(String str, char ch) {
		char charArray[] = str.toCharArray();
		StringBuilder sb = new StringBuilder(str);
		int len =str.length();
		
		System.out.println(" Removing multiple ocurrences \n");
		/*for(int i=0; i<len;i++) {
			System.out.println(" initial "+len+charArray[i]);
			
			if(charArray[i]==ch) {
				sb.deleteCharAt(i);
				//charArray[i]=charArray[i+1];
				System.out.println(charArray[i]);
				len--;
			}
		}*/
		
		
		
		
		System.out.println(sb.toString());
	}

	private static void RemoveCharFirstOcurrence(String str, char ch) {

		char charArray[] = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ch) {
				while (i < charArray.length - 1) {
					charArray[i] = charArray[i + 1];
					i++;
				}
			}
		}

		System.out.println("Removing the character " + ch + " from beginning \n");

		for (int i = 0; i < charArray.length - 1; i++)
			System.out.print(charArray[i]);
		System.out.println("\n");

	}

}
