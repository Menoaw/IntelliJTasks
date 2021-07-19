package day10_NestedIfStatements;

public class Ternary {
    public static void main(String[] args) {
        /*
        String result = (condition) ? value : value
                                        If      Else

         */

        int number = 100;
       String result = "";


        if(number%2==0) {
            result = "Even";
        }else {
            result = "Odd";
        }
        System.out.println("result = " + result);

        String result2 = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("result2 = " + result2);




    }
}
