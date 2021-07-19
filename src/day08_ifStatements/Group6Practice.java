package day08_ifStatements;

public class Group6Practice {

    public static void main(String[] args) {

        int number = -1;

     boolean positive = number >0;
     boolean negative = number<0;
     boolean zero = !positive && !negative;

     if (positive){
         System.out.println(number+" is positive");
     }
     if (negative){
         System.out.println(number+" is negative");
     }
    if (zero){
        System.out.println(number+" is zero");
    }

        System.out.println("------------------------");

    String name = "John";
    int score = 61;

    boolean passed = score >= 60;
    boolean failed = score < 60;

    if (passed){
        System.out.println("you passed!");
    }
    if (failed){
        System.out.println("you failed");
    }

        System.out.println("------------------------");


        int number1 =32;
        boolean odd = number1%2 != 0;
        boolean even = !odd;

        if (odd){
            System.out.println(number1+" is odd");
        }
        if (even){
            System.out.println(number1+ " is even");
        }






    }


}
