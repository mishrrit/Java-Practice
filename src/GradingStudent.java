/*
 HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100 .
Any  less than 38  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the grade  and the next multiple of 5  is less than 3 , round  up to the next multiple of 5 .
If the value of grade  is less than 38 , no rounding occurs as the result will still be a failing grade.
For example,grade=84 will be rounded to 85 but 29 will not be rounded because the rounding would result in a number that is less than 38.

Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.
 Complete the function solve that takes an integer array of all grades, and return an integer array consisting of the rounded grades. For each , round it according to the rules above and print the result on a new line.

Input Format

The first line contains a single integer denoting n (the number of students). 
Each line  of the  subsequent lines contains a single integer, , denoting student 's grade.

Constraints
1<=n<=60
0<=gradei<-100
Output Format

For each gradei of the n grades, print the rounded grade on a new line.

Sample Input 0

4
73
67
38
33
Sample Output 0

75
67
40
33
Explanation 0

image

Student 1 received 73, and the next multiple of 5 from 73 is 75 . Since 75-73<3, the student's grade is rounded to 75.
Student 2 received 67 , and the next multiple of 5 from 67 is 70. Since 70-67=3, the grade will not be modified and the student's final grade is 67 .
Student 3 received 38, and the next multiple of 5 from 38 is 40 . Since 40-38<3, the student's grade will be rounded to 40 .
Student 4 received 33,grade below 38, so the grade will not be modified and the student's final grade is 33 .
 */


import java.util.Scanner;

public class GradingStudent {

	static int[] solve(int[] grades){

		int n = grades.length;
		int[] marks = new int[n] ;
		int x =0;
		for(int i=0;i<grades.length;i++) {
			 x =grades[i];
		
			if(x>37) {
				int y=x;
				if(y%5>2) {
					x= x + (5-y%5);
					
				}else {
					x=y;
				}
				
			} 
			
			marks[i]=x;
		}
		return marks;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for(int grades_i=0; grades_i < n; grades_i++){
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
		in.close();


	}

}
