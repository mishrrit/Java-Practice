package hackersRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class stdinstdout {

    public static void main(String[] args) throws Exception {

	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);

	Scanner scan = new Scanner(System.in);
	int i = scan.nextInt();
	double d = scan.nextDouble();
	String s = br.readLine();

	// Write your code here.

	System.out.println("String: " + s);
	System.out.println("Double: " + d);
	System.out.println("Int: " + i);
	scan.close();
	br.close();
    }

}
