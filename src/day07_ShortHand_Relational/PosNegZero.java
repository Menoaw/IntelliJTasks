package day07_ShortHand_Relational;

public class PosNegZero {
    public static void main(String[] args) {
        int num = 100;
        boolean isPositive = num > 0;
        boolean isNegative = num < 0;
        boolean isZero = num == 0;

        //boolean isZero = isNegative == false && isPositive == false;
        //boolean isPositive = isNegative == false && isZero == false;
        //boolean isNegative = isPositive == false && isZero ==false;

        System.out.println(num + " is a positive number: "+isPositive );
        System.out.println(num + " is a negative number: "+isNegative);
        System.out.println(num + " is zero: "+isZero);


    }
}
