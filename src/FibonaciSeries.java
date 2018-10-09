import java.util.Scanner;

public class FibonaciSeries {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println(" Enter the nth number \n");
		Scanner in = new Scanner(System.in);
		String input = in.next();
		int limit = Integer.parseInt(input);
		
		int nthNumber = Fibonaci(limit);
		System.out.println(limit+" number in the fibonacci series is "+nthNumber);
		
	}

	private static int Fibonaci(int input) {
		
		int init =1;
		int sum =0;
		int firstnum = 1;
		int counter =1;
		
		if(input==0) {
			return 0;
		}else if(input==1) {
			return 1;
		}
		
		while(counter<input) {
			sum = init + firstnum;
			init = firstnum;
			firstnum=sum;
			counter++;
		}
		
		return sum;
	}

}
