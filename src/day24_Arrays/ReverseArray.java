package day24_Arrays;

import java.util.Arrays;

/*
4. Write a program that can reverse an array of integers
		ex:
			array = {1,2,3,4,5};
		output:
			reversedArray = {5,4,3,2,1};
 */
public class ReverseArray {
    public static void main(String[] args) {


        int[] array = {1,2,3,4,5};
        int[] reversedArray = new int[array.length];

        for (int i = array.length-1, j = 0; i >= 0 ; j++,i--) { //i is index of array starting from last index
                                                                //j is index numbers of reversedArray starting from index 0

            reversedArray[j] = array[i];

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));



    }
}
