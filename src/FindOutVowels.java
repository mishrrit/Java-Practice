import java.util.Scanner;

public class FindOutVowels {

	public static void main(String[] args) {
	
		Scanner name = new Scanner(System.in);
		System.out.println("Enter the String");

		char[] nameArray =name.nextLine().toCharArray();
		int count =0;
		for(char c:nameArray) {
			String cname =Character.toString(c); 

			if((cname.equalsIgnoreCase("A"))||(cname.equalsIgnoreCase("E"))||(cname.equalsIgnoreCase("I"))||(cname.equalsIgnoreCase("O"))||(cname.equalsIgnoreCase("U"))){
				{
					count++;
				}

			}
		}

		System.out.println(" Number of vowels are "+count);		

	}

}
