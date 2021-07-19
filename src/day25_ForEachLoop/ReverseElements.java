package day25_ForEachLoop;

import java.util.Arrays;

/*
1. write a program that can  reverse each elements in an array of string
		Ex:
		    array = {"Java", "Python", "C#"}
	    	output:
	    		["avaJ", "nohtyP", "#C"]
 */
public class ReverseElements {
    public static void main(String[] args) {


        String[] ar = {"Java", "Python", "C#"};

        for (int j = 0; j < ar.length; j++) {

            String element = ar[j]; //Java
            String reverse = ""; //avaJ

            for (int i = element.length() - 1; i >= 0; i--) {
                reverse += element.charAt(i);
            }
            ar[j] = reverse;

        }

        System.out.println("ar = " + Arrays.toString(ar));
    }
}
