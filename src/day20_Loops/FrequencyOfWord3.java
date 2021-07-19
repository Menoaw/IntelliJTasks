package day20_Loops;

import java.util.Scanner;

public class FrequencyOfWord3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String sentence = scan.nextLine();
        System.out.println("Enter Word 1:");
        String word1 = scan.next();
        System.out.println("Enter Word 2:");
        String word2 = scan.next();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i <= sentence.length() - word1.length(); i++) {
            String each = sentence.substring(i, i + word1.length());
            if (each.equals(word1)) {
                count1++;
            }
            if (each.equals(word2)) {
                count2++;
            }
            System.out.println(each);

        }
        System.out.println("count1 = " + count1);
        System.out.println("count2 = " + count2);
        boolean isEqual = count1 == count2;
        System.out.println("isEqual = " + isEqual);
    }
}