package Replit.Rep_02_Statements;

import java.util.Scanner;

public class ConditionalStatementPractice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.next();

        if (name.equalsIgnoreCase("chen")){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }



    }
}
