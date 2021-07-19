package day17_String;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String website = scan.next();

        scan.close();

        boolean www = website.startsWith("www.");
        boolean end = website.endsWith(".com")|| website.endsWith(".edu")||website.endsWith(".gov");

        System.out.println("www = " + www);
        System.out.println("end = " + end);
        if(www&&end) {
            System.out.println(website + " is a valid website");
        }
        if(website.endsWith("ly")){
            System.out.println("Really???");
        }


    }
}
