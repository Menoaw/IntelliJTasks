package day08_ifStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int number = 100;


        boolean positive = number >0;
        boolean negative = number < 0;
        boolean zero = !positive && !negative;

        if(positive){//if the number is positive
            System.out.println(number+" is positive");
        }
        if(negative){// if the number is negative
            System.out.println(number+ " is negative");
        }
        if (zero){//if the number is zero
            System.out.println(number + " is zero");
        }
        System.out.println("-----------------------------");



    }


}
