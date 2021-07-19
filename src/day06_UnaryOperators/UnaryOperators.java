package day06_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = 100;
        ++a;
        System.out.println("a = " + a);

        int b = 100;
        --b;
        System.out.println("b = " + b);
        /*
        --1200 = pre-increment/pre-decrement reduces immediately.

        1200-- = post-increment/post-decrement reduces
         */
        System.out.println("--------------");

        int x = 10;
        //System.out.println("x = " + ++x); //pre:increase right away
        System.out.println("x = " + x++); //10 post: first passes the current value, then change value by 1
        System.out.println(x); //shows as 11 since its after the first posting of increment.

        System.out.println("----------------------");
        int n1 = 50;
        int n2 = n1++;
        // n2 = 50, n1 = 51
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        int a1 = 100;
        int a2 = ++a1;
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("----------------");
        int r = 200;
        System.out.println(r++); //200. delay
        System.out.println(r); //201
        System.out.println(++r); //202

        int y = 100;
        int result = y++ + 1;
        System.out.println("y = " + y);
        System.out.println("result = " + result);

        int z = 100;
        int result2 = ++z + 1;
        System.out.println("z = " + z);
        System.out.println("result2 = " + result2);


        //int j = 100;
        //int j2 = j++;
        //System.out.println("j = " + j);
        //System.out.println("j2 = " + j2);
        //System.out.println("j2 = " + j2);



    }



}
