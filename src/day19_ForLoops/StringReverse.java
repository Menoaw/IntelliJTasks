package day19_ForLoops;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        String name = new Scanner(System.in).nextLine();
        String reverseName = "";

        for (int i = name.length()-1; i >=0 ; i--) {
            reverseName+= name.charAt(i);
        }
        System.out.println(reverseName);

    }
}
