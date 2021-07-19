package day23_Arrays;

import java.util.Scanner;

public class FrequencyOfEachCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String removeDupe = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);

            if (removeDupe.contains("" + ch)) {
                continue;
            }
            removeDupe += ch;
        }
        System.out.println("removeDupe = " + removeDupe); //abc


        for (int j = 0; j < removeDupe.length(); j++) {


            char ch = removeDupe.charAt(j); //a then b then c
            int frequency = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    frequency += 1;
                }
            }
            System.out.print("" + ch + frequency);
        }

        String result = ""; //a2b1c3


    }
}
