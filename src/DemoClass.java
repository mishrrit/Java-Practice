
public class DemoClass {

	public static void main(String[] args) {
		System.out.println(" start    ");
		int a =methoda(1,3);
		System.out.println(a);
		System.out.println("i am in main method");
		
		 methodb();
		 methodc(10);

	}
	
	
	private static int methoda(int i,int j) {
		System.out.println(" I am inside methoda");
		System.out.println(i+j);
		return i+j;
	}
	
	
	private static void methodb() {
		
		int i= 10;
		int j= 20;
		System.out.println(i+j);
		
	}
	
	private static void methodc(int i) {
		
		System.out.println(i);
		
	}
	
	
	 static int methodd() {
		 
		 return 0; 
		
	}

}

