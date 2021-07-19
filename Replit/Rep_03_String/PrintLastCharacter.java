package Rep_03_String;

import java.util.Scanner;

public class PrintLastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        System.out.println(word.substring(word.length()-1));

    }
}
