import java.util.Scanner;

public class test {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Enter the inputs ");
		Scanner in = new Scanner(System.in);
		String getvalue = in.nextLine();
		
		System.out.println(in.getClass().getSimpleName());
		
		Object object = in;
		if(object instanceof Integer) {

			Integer integer = (Integer) object ;
			System.out.println(" Its a number"+integer);

			} else {
			 System.out.println(" Its not a number");
			}

	}*/
	
	/*static int i=0;
	static int sum=0;
	
	public static int m(){
		
		if(++i <= 10){
		sum=sum+i;
		m();
		}
		return sum;
	}
	
	public static void main(String... abc){
		
		System.out.println(test.m());
	}*/
	
	
		
		static int i=0;
		static int sum=0;
		
		public static void m(){
			
			if(++i <= 10){
			sum=sum+i;
			System.out.println(sum);
			m();
			}
			
		}
		
		public static void main(String... abc){
			
			test.m();
		}
	}


