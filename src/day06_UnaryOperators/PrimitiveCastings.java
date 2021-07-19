package day06_UnaryOperators;

import java.text.DecimalFormat;

/*
Primitive Castings: converting one primitive type to another
double>float>long>int>short>byte
larger primitive type cannot be directly assigned to smaller type
 2 types:
    Implicit Casting: casting smaller type to larger. (automatic dont worry)
        double a = 3
            a ==> 3.0
        long l = 10;
            l = 10l;
    Explicit Casting: casting larger type to smaller. manually.
        double a = 3;
        int b = (short)a; //// int b = (int)a;
 */
public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 10;
        long b = a; //implicit casting, automatic.

        double d = 300.0;
        int f = (int)(long)d; //explicit casting, manual.
        System.out.println("------------------");
        long n = 100;
        short m = (byte)n;

        float q = 2.5f;
        int u = (int)q;
        System.out.println(u);

        long r = (long)q;
        short s = (short) q;
        System.out.println( (double)2.5f);
        System.out.println( (double)10l);

        /*
        int z = 300;
        int x = (byte)z;
        System.out.println(x);
        */

        int w = 129;
        byte z = (byte)w; //get negative number if out of range.
        System.out.println("z = " + z);

        int e = 70000;
        short g = (short) e;
        System.out.println("g = " + g);
        System.out.println("----------------------");

        double num1 = 1000.0;
        int num2 = (int) num1;
        System.out.println("num2 = " + num2); //1000
        System.out.println("num1 = " + num1); //1000.0

        System.out.println( (int)100.23456); //output is 100
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(1.123456789));

    }

}
