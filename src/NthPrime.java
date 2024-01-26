import java.util.Scanner;
/*
 * To be corrected- not working 
 */
public class NthPrime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" input the number ");
		int nth = in.nextInt();
		
		int prime = Prime(nth);
		System.out.println(nth+ " prime number is "+prime);
		in.close();
		

	}

	private static int Prime(int nth) {
		
		/*for(int i=0;i <nth;i++) {
			for(int j=2;i==0;j++) {
				
			}
		}*/
		int count = 0;
		int i;
		int x;
		int j;
		/*for(i = 2, x = 2; i <= nth; i++) {
            for(x = 2; x < i; x++) {
                if(i % x == 0) {
                    break;
                }
            }
            if(x == i) {
                System.out.printf("\n%d is prime", x);
                count++;
                
            }
        }
        }*/
		
		
			for(j=2,x=2;j<nth ; j++,x++) {
				if(j%x==0) {
					count++;
				}
				
					
				
			}
		
		return x;
	}

}
