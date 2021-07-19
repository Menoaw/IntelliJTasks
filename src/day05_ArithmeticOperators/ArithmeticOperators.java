package day05_ArithmeticOperators;
/*
Arithmetic Operators:
+: addition
-: subtraction
*: multiplication
    Integer * Decimal = Decimal result.
    Integer * Integer = Integer
/:division
    integer/integer = integer
    double/integer = double
    integer/double = double
    double/double = double
%: remainder

in math:
    10/4 = 2.5
    10/3 = 3.333

in Java:
    10/4 = 2
    10.0/4 = 2.5
    10/3 = 3



 */


public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(25/2);
        System.out.println(25.0/2);
        System.out.println(25d/2); //d is equivilent of decimal.
        //System.out.println(10/0); cannot be divided by 0.
        //double test = 1.123456789;
        //System.out.format("%.5f",test);

        int a = 100/3; //33
        System.out.println("a = " + a);
        double b = 100/3; //33.3333... or 33 or 33.0
        // still reads as integer, but double makes it format as a decimal.
        //      b = 33 ==> 33.0
        System.out.println("b = " + b);
        double c = 100.0/3;
        System.out.println("c = " + c);

        /*%: remainder: numerator-(denominator * integer number of result)
         10/4 = 2.5
         10 - (4*2) = 2

         15/6 = 2.5
         remainder: 15 - (6*2) = 3
         or 15%6 : returns the remainder of 15/6
         */
        int n1 = 100;
        int n2 = 40;

        System.out.println(n1%n2); //20

        /*
        30/7 = 4
        30 - 7*4 = 2

    1st number divided second number give result
                */
        double num1 = 10;
        double num2 = 3;
        System.out.println(num1+" Divided by "+num2+" is equal to "+num1/num2+ " with a remainder of "+num1%num2);

    }


}
