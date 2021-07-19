package day25_ForEachLoop;

import java.util.Arrays;

/*
2. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}
		output
			arr3 = {1,2,3,4,5,6}
 */
public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4},
                arr2 = {5,6};

        int[] arr3 = new int[arr1.length+ arr2.length];
        int j = 0; //this saves the index number of third array which was last used.

        for (int i = 0; i < arr1.length; i++) {
            arr3[j++]=arr1[i]; //gets j up to 4

        }


        for (int i = 0; i < arr2.length; i++) {
            arr3[j++]=arr2[i];// has j starting at 4, and arr2 starts at 1
        }


        System.out.println(Arrays.toString(arr3));

    }
}
