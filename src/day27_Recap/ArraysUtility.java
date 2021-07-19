package day27_Recap;

import java.util.Arrays;
/*
        Arrays.toString();       //printing 1D array
        Arrays.deepToString();      //printing multiD array
        Arrays.sort();              //to sort alphabetically/numerically
        Arrays.equals();            //check if array equal to another

        Arrays.copyOf();
        Arrays.copyOfRange();
*/
public class ArraysUtility {
    public static void main(String[] args) {

      int[] nums = {1,2,3};
      int[] number = Arrays.copyOf(nums, 5);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(number));

        System.out.println("----------------------------------");

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] arr3 = Arrays.copyOf(arr1,arr1.length+arr2.length);

        int i = arr1.length;
        for (int each:arr2){
            arr3[i++]=each;

        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("----------------------------------");
        //            0  1  2  3  4  5  6  7  8
        int[] data = {10,20,30,40,50,60,70,80,90};
        int[] someData = Arrays.copyOfRange(data,2,6+1); //30,40,50,60. //add+1 since substring doesnt take last data
        System.out.println(Arrays.toString(someData));
        System.out.println("----------------------------------");

        char[] characters = new char[26];
        int j = 0;
        for (char k = 'A'; k <='Z'; k++){
            characters[j] = k;
            j++;

        }
        System.out.println(Arrays.toString(characters));

        char[] first10Letters = Arrays.copyOfRange(characters,0,10);
        System.out.println(Arrays.toString(first10Letters));

        char[] last10Letters = Arrays.copyOfRange(characters,characters.length-10,characters.length);
        System.out.println(Arrays.toString(last10Letters));




    }
}
