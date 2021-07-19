package day07_ShortHand_Relational;

public class SwipeTwoNumbers {

    /*
    1. write a program that can swipe two variables' value by using a temporary variable
    ex:
        if a= 10, b=15

    output:
        a = 15
        b = 10

     */
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = a; // 20
        a = b; // a = 30
        b = c; // b = 20

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        /*
        int c = 100;
        int d = -c++ + ++c - c-- * c-- % 2;
        //  d = -100 + 1 + 101 - 100 - 1 * 100 -1 % 2
        //      -99  + 101 - 100 - 1 * 100 -1 % 2
        //      2 - 100 - 1 * 100 - 1 % 2
        //      -98 - 1 * 100 - 1 % 2
        //      -98 - 100 - 1 % 2
        //      -198 -
        System.out.println("d = " + d);
        */


    }



}
