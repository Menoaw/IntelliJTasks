package day29_ReturnMethods;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
1. create a function that can check if the given integer is positive, negative or zero

2. create a function that can print out the combination of two integer arrays

3.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");

                output:
                    "Cybertek School"
4. create a function that can print out the maximum number between two numbers

5. create a function that can print out the array of integers in descending order
 */
public class WarmUpTasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        posNegZero(scan.nextInt());
        System.out.println("-----------------------");
        int[] ar1={1,2,3};
        int[] ar2 = {4,5,6};
        mergeTwoArrays(ar1,ar2);
        System.out.println("-----------------------");
        fullNameFormat(scan.next(), scan.next());
        System.out.println("-----------------------");
        System.out.println("Enter first and second number");
        printMaxNumber(scan.nextInt(), scan.nextInt());
        System.out.println("-----------------------");
        int[] ar3 = {1,2,3,4,5};
        printInDescendingOrder(ar3);



    }

    //1. create a function that can check if the given integer is positive, negative or zero
    public static void posNegZero(int number){
        if (number > 0){
            System.out.println("Number is positive");
        }else if(number < 0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is Zero");
        }
    }
    //2. create a function that can print out the combination of two integer arrays
    public static void mergeTwoArrays (int[] array1, int[] array2){
        int[] array3 = new int[array1.length+array2.length];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[j] = array1[i];
            j++;
        }
        for (int i = 0; i < array2.length; i++) {
            array3[j] = array2[i];
            j++;
        }
        System.out.println(Arrays.toString(array3));
    }
    //3.  write a method that can print out the full name of a person in regular format
    //            ex:
    //               fullName("cYbErTeK", "SCHOOL");
    //
    //                output:
    //                    "Cybertek School"
    public static void fullNameFormat (String firstName, String lastName){

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1,firstName.length()).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1,lastName.length()).toLowerCase();


        System.out.println(firstName+" "+lastName);
    }
    //4. create a function that can print out the maximum number between two numbers
    public static void printMaxNumber (int number1, int number2){
        if (number1>number2){
            System.out.println(number1);
        }else if (number2>number1){
            System.out.println(number2);
        }else{
            System.out.println(number1);
        }
    }
    //5. create a function that can print out the array of integers in descending order
    public static void printInDescendingOrder(int[] array){
        Arrays.sort(array);
        int[] array2 = new int[array.length];
        for (int i = 0, j = array.length-1; i < array.length; i++) {
            array2[i] = array[j];
            j--;
        }
        System.out.println(Arrays.toString(array2));
    }



}
