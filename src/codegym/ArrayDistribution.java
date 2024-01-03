package codegym;
/*Write a program that evenly distributes the elements of the array named array among the array1, array2 and array3 arrays according to the following rule:

0th element in array1, 1st -> array2, 2nd -> array3, 3rd -> array1, etc.

Requirements:
The program must not read anything from the keyboard.
The program must evenly distribute elements of the array array to array1, array2 and array3 arrays.

*/

import java.util.Arrays;

public class ArrayDistribution {
    public static int[] array = new int[] { -10, 20, 30, -40, -50, 60, 70, -80, -90 };
    public static int[] array1 = new int[3];
    public static int[] array2 = new int[3];
    public static int[] array3 = new int[3];

    public static void main(String[] args) {

	int i = 0;
	int j = 0;
	int k = 0;
	while (i < array.length) {

	    k = i / 3;
	    if (j % 3 == 0) {
		array1[k] = array[i];
	    } else if (j % 3 == 1) {
		array2[k] = array[i];
	    } else if (j % 3 == 2) {
		array3[k] = array[i];
	    }
	    if (k >= 2) {
		k = 0;
	    } else {
		k++;
	    }

	    if (j >= 2) {
		j = 0;
	    } else {
		j++;
	    }
	    i++;
	}

	System.out.println(Arrays.toString(array1));
	System.out.println(Arrays.toString(array2));
	System.out.println(Arrays.toString(array3));
    }

}
