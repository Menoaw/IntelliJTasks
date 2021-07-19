package day23_Arrays;

import java.util.Scanner;

public class FrequencyOfACharacter {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String str = "acccacbcbcccccd";
        char ch = 'c';
        int frequency = 0;

        for (int i = 0; i <str.length() ; i++) {
            char each = str.charAt(i);
                if(each == ch) {
                    frequency += 1;
                }


        }
        System.out.println("frequency = " + frequency);



    }
}
