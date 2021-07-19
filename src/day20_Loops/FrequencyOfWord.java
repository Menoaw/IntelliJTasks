package day20_Loops;

import java.util.Scanner;

/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2
 */
public class FrequencyOfWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = "Java Java";
        String word = "Java";
        int count = 0;
        String str1 = sentence.substring(0,4); //Java
        String str2 = sentence.substring(1,5);//ava
        String str3 = sentence.substring(2,6);//va J
        String str4 = sentence.substring(3,7);//a Ja

        for (int i = 0; i <= sentence.length()-word.length(); i++) {
           String each = sentence.substring(i,i+word.length()); //represents every combination of 4 characters in a row
            if(each.equals(word)){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
