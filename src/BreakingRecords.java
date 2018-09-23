import java.util.Scanner;

public class BreakingRecords {

	static int[] breakingRecords(int[] score) {
		int n = score.length;
		//int k = 0;
		int temp1;
		int temp2;
		int count = 0;
		int less = 0;
		int[] solution = new int[2];
		temp1 = score[0];
		temp2 = score[0];

		//for (int i = 0; i < n - 1; i++) {
			for(int j=1;j<n;j++) {

			/*System.out.println(" before ");
			System.out.println("score of i is  "+temp1 + " and " + score[j]);*/
			
				if (temp1 < score[j]) {
				temp1 = score[j];
				count++;
			} else
				continue;

			
			System.out.println(" after ");
			System.out.println("score of i is  "+temp2 + " and " + score[j]);
			if (temp2 > score[j]) {
				temp2 = score[j];
				less++;
			} else
				continue;
			
			
			/*if (temp2 < score[i + 1]) {
				temp2 = score[i];
				score[i] = score[i + 1];
				score[i + 1] = temp2;
				less++;
				k = i + 1;
				// temp2 =score[i+1];
			} else
				continue; */

		}
	//	}
		/*
		 * int i=0; while(i<n) {
		 * 
		 * temp1 =score[i]; if (temp1< score[i + 1]) { //temp1 =score[i];
		 * score[i]=score[i+1]; score[i+1]=temp1; count++;
		 * 
		 * } else continue; }
		 */

		solution[1] = less;
		solution[0] = count;

		//System.out.println(less + " " + count);
		// System.out.println(less);

		return solution;
		// Complete this function
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		int[] result = breakingRecords(score);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
