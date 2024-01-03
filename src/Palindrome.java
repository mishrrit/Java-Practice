import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string \n");
		Scanner in = new Scanner(System.in);
		String Input = in.nextLine();
		
		System.out.println(" Given String is "+Input);
		System.out.println("**********************************");
		boolean PalindromeFlag =FindPalindrome(Input);
		
		System.out.println(" Given string "+Input+ " is Palindrome :"+PalindromeFlag);
		in.close();
	}

	private static boolean FindPalindrome(String input) {
		
		char[] inputarray = input.toCharArray();
		
		int init=0;
		int len = inputarray.length;
		boolean flag = false;
		
		while(init <len) {
			
			if(inputarray[init]==inputarray[len-1]){
				System.out.println(inputarray[init]+" compared with "+inputarray[len-1]);
				init++;
				len--;
				flag =true;
				
			}else {
				System.out.println(" Given String "+input+" is not palindrome");
				
				break;
			}
			
		}
		
		return flag;
		
		
	}

}
