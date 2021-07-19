package day30_Recap;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class MethodsReview {
    public static void main(String[] args) {
        int[] randomNum = {1,5,8,3,9,4};
        String str = "java";
        String str2 = "avaj";

        System.out.println("reversed");
        String reversed = StringUtility.reverse(str);
        System.out.println(reversed);

        System.out.println("removeDup:");
        System.out.println(StringUtility.removeDup(str));
        System.out.println("Is Anagram:");
        System.out.println(StringUtility.isAnagram(str,str2));

        System.out.println("getMax");
        System.out.println(ArraysUtility.max(randomNum));

        System.out.println("getMin");
        System.out.println(ArraysUtility.min(randomNum));

    }
}
