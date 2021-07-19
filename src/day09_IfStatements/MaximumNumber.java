package day09_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {
        /*
        1. write a program that can print out the maximum number between two different numbers
            Ex:
                num1 = 20;
                num2 = 30;

            output:
                    30 is the maximum number
         */

        int a = 20;
        int b = 10;
        if (a<b){
            System.out.println(b+" is the maximum number");
        }
        if (a>b){
            System.out.println(a+" is the maximum number");
        }
        System.out.println("-------------------------");
        if(a<b){
            System.out.println(b+" is the maximum number");
        }
        else{
            System.out.println(a+" is the maximum number");
        }



    }


}
