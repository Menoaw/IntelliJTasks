package day20_Loops;

import java.util.Scanner;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String sentence = scan.nextLine();
        System.out.println("Enter Search Word:");
        String word = scan.next();
        int count = 0;
        for (int i = 0; i <=sentence.length()-word.length() ; i++) {
            String each = sentence.substring(i,i+word.length());
            if(each.equals(word)){
                count ++;
            }

        }
        System.out.println("count = " + count);


    }
}
