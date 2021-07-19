package day15_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Muhtar"; //charAt
        char ch = str.charAt(0);
        System.out.println("ch = " + ch);

        String word = "Cybertek School";
        char ch1 = word.charAt(9);

        System.out.println("ch1 = " + ch1);

        String word2 = "Java";
        char ch2 = word2.charAt(2);
        System.out.println("ch2 = " + ch2);

        System.out.println("--------------------------------");

        String sentence = "Hello everyone, how are you all today?";
        int totalNumberOfCharacters = sentence.length();
        System.out.println("totalNumberOfCharacters = " + totalNumberOfCharacters);
        //character starts at 1
        //index starts at 0
        String s1 = "Cybertek";
        char firstCharacter = s1.charAt(0);
        char lastCharacter = s1.charAt(s1.length()-1); //getting last index
        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

        System.out.println("---------------------------------");
        String s = "cybertek";
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println("---------------------------------");

        String s2 = "JAVA PROGRAMMING LANGUAGE";
        s2 = s2.toLowerCase();
        System.out.println("s2 = " + s2);
        System.out.println("---------------------------------");

        String schoolName = "       Cybertek   School ";
        System.out.println("schoolName = " + schoolName);
        schoolName = schoolName.trim();
        System.out.println("schoolName = " + schoolName);

        String sentence1 = "Hello everyone, how are you all Today Today is a good day?";
        System.out.println(sentence1.substring(6,(sentence1.length()-1)));
        System.out.println("---------------------------------");

        String sentence2 = sentence1.replace("Today", "Tomorrow");
        System.out.println(sentence2);
        System.out.println("---------------------------------");

        System.out.println(sentence1.indexOf("Today"));
        System.out.println(sentence1.lastIndexOf("Today"));
        System.out.println(sentence1.charAt(38));

        System.out.println("---------------------------------");
        String sentence3 = "   Cat Dog    ";

        System.out.println(sentence1.isEmpty());
        System.out.println(sentence3.trim());
        System.out.println("---------------------------------");
        /*
        .equals.IgnoreCase()  ==      Cat.equalsIgnoreCase("cat")
        .equals()
         */
        String b1 = "Cat";
        String b2 = "cat";
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.equalsIgnoreCase(b2));
        System.out.println("---------------------------------");

        String q1 = "Today is a long day";
        System.out.println(q1.indexOf("Today"));



/*


        System.out.println("---------------------------------");
        String a1 = ("Cat");
        String a2 = ("cat");
        boolean b1 = a2.toLowerCase().equals(a1.toLowerCase());
        //boolean b1 = a2.equalsIgnoreCase(a1);
        System.out.println(a2.toLowerCase());
        System.out.println(a1.toLowerCase());
        System.out.println(b1);
        System.out.println("---------------------------------");
 */








    }
}
