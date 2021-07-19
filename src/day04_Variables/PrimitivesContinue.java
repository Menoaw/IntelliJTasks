package day04_Variables;

/*
int: for integers
double: for decimals
Char: all characters, 0 - 65535, single characters only. use ' '.
Boolean: true - false
 */

public class PrimitivesContinue {
    public static void main(String[] args) {
        //#
        char ch1 = '#'; //also can use 35 from ascii table to equal #
        char ch2 = 35;

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        //Z
        char ch3 = 'Z';
        char ch4 = 90;

        System.out.println("ch3 = " + ch3);
        System.out.println("ch4 = " + ch4);

        char ch5 = 15 + 45; //gives char 60 "<"
        System.out.println("ch5 = " + ch5);

// Boolean
        // 10 > 9
        boolean r1 = 10 > 9;
        System.out.println("r1 = " + r1);

        boolean r2 = true;
        boolean r3 = false;
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        boolean isFullTime = false;
        boolean isMarried = true;
        boolean isPandemic = true;

        boolean r4 = "Java" == "Python"; // equal operator: ==
        System.out.println("r4 = " + r4);

        boolean r5 = "Muhtar" == "Good guy";
        System.out.println("r5 = " + r5);


        /*
        if isPandemic:
            buy toilet paper
        else:
            party
         */




    }

}
