package day23_Arrays;

import java.util.Arrays;

public class MaximumMinimumNumber {
    public static void main(String[] args) {


        int[] n = {4,5,2,7,1,6,3};
        int highest =n[0];
        int lowest = n[0];

        for (int i = 0; i < n.length; i++) {
            if(n[i]>highest){
                highest = n[i];
            }
        }

        for (int i = 0; i < n.length; i++) {
            if(n[i]<lowest){
                lowest = n[i];
            }
        }
        System.out.println(highest);
        System.out.println(lowest);
        System.out.println("-------------------------------");




            }

        }