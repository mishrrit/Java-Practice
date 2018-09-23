import java.util.Scanner;

/*
 Sam's house has an apple tree and an orange tree that yield an abundance of fruit. In the diagram below, the red region denotes his house, where  is the start point, and  is the endpoint. The apple tree is to the left of his house, and the orange tree is to its right. You can assume the trees are located on a single point, where the apple tree is at point , and the orange tree is at point .

Apple and orange(2).png

When a fruit falls from its tree, it lands  units of distance from its tree of origin along the -axis. A negative value of  means the fruit fell  units to the tree's left, and a positive value of  means it falls  units to the tree's right.

Complete the function countApplesAndOranges,

where,

 s,Starting point of Sam's house location. 
 t,Ending location of Sam's house location. 
 a,Location of the Apple tree. 
 b,Location of the Orange tree. 
 m,Number of apples that fell from the tree. 
 apple,Distance at which each apple falls from the tree. 
 n,Number of oranges that fell from the tree. 
 oranges, Distance at which each orange falls from the tree.

Given the value of d for m apples and n oranges, can you determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range[s,t] )? Print the number of apples that fall on Sam's house as your first line of output, then print the number of oranges that fall on Sam's house as your second line of output.

Input Format

The first line contains two space-separated integers denoting the respective values of s and t. 
The second line contains two space-separated integers denoting the respective values of a and b. 
The third line contains two space-separated integers denoting the respective values of m and n. 
The fourth line contains m space-separated integers denoting the respective distances that each apple falls from point a . 
The fifth line contains n space-separated integers denoting the respective distances that each orange falls from point b.

Constraints
1<s,t,a,b,m,n<10*10*10*10*10
-10*10*10*10*10<=d<=10*10*10*10*10
a<s<t<b
Output Format

Print two lines of output:

On the first line, print the number of apples that fall on Sam's house.
On the second line, print the number of oranges that fall on Sam's house.
Sample Input 0

7 11
5 15
3 2
-2 2 1
5 -6
Sample Output 0

1
1
Explanation 0

The first apple falls at position 5-2=3 . 
The second apple falls at position5+2=7 . 
The third apple falls at position 5+1=6 . 
The first orange falls at position 15+5=20. 
The second orange falls at position 15-6=9. 
Only one fruit (the second apple) falls within the region between  and , so we print  as our first line of output. 
Only the second orange falls within the region between  and , so we print  as our second line of output.
 */

public class AppleandOranges {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int n = apples.length;
		int m = oranges.length;
		int[] appy = new int[n];
		int[] orry = new int[m];
		int countapples = 0;
		int countoranges = 0;
		for (int i = 0; i < n; i++) {
			appy[i] = a + apples[i];
			if (appy[i] <= t && appy[i] >= s) {
				countapples++;
			}
		}
		for (int i = 0; i < m; i++) {
			orry[i] = b + oranges[i];
			if (orry[i] <= t && orry[i] >= s) {
				countoranges++;
			}
		}
		System.out.println(countapples);
		System.out.println(countoranges);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}
		countApplesAndOranges(s, t, a, b, apple, orange);
		in.close();
	}

}
