
public class SwapNumbers {
	private static int a[] = {1,2,3,4,5,6,7,8,9,10};
	private static int b;
	static int i,j;
	
	public static void main(String args[]) {
		i=2;
		j=6;
		
		
		Swap(a,i,j);
		
	}

	private static void Swap(int c[], int i2, int j2) {
		int b=c[i2-1];
		c[i2-1]=c[j2-1];
		c[j2-1]=b;
		System.out.println("Value at a[i]= "+c[i2-1]+" and value of c[j]="+c[j2-1]);
	}
	
	
}
