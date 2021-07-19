package day09_IfStatements;

public class IfStatementWithoutCurlyBrace {
    public static void main(String[] args) {
        int number = 5;
        if(number%2 ==0) //able to use no curly braces WITH ONLY ONE statement
            System.out.println("even");
        //System.out.println("number"); //this gives error since two statements.
        else
            System.out.println("odd");




    }



}
