import java.util.Scanner;


public class PrimeNo {

	public static void main(String[] args) 
	{
		int i ;
		int j = 1;
		int k = 0;
		String s;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number \n" );
		i = in.nextInt();
			if (i == 0 || i==1)
			{
				System.out.println(" 0 and 1 are exception");
			}
			else 
				{
					for (j=1;j <= i;j++)
					{
						if (i%j == 0) 
						k++;
											
					}	
					if (k==2)
						System.out.println("its a prime number");
					else System.out.println("Its not a prime number");	
				}	
	}

}
