package day16_StringDay2;
/*
replace(old value, new value)
 */
public class StringMethods {
    public static void main(String[] args) {

        String email = "Cybertek@yahoo.com";
        System.out.println(email);
        email = email.replace("yahoo","gmail");
        System.out.println(email);

        System.out.println("-------------------------------------------");

        String sentence = "C# is cool, C# is fun";
        sentence = sentence.replaceFirst("C#","Java");
        System.out.println(sentence);

        System.out.println("-------------------------------------------");

        String sentence2 = "Java is a cool language";
        int indexOfFirstA = sentence2.indexOf("a");
        System.out.println("indexOfFirstA = " + indexOfFirstA);

        System.out.println("-------------------------------------------");

        String s2 = "     ";
        boolean r1 = s2.trim().isEmpty();
        System.out.println("r1 = " + r1);

        System.out.println("-------------------------------------------");

        //equals() or equalsIgnoreCase()

        String str1 = "Cat"; //string pool
        String str2 = new String("Cat");//java heap
        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true

        System.out.println("-------------------------------------------");

        String word1 = "Java";
        String word2 = "java";

        System.out.println(word1 == word2); //false, diff objects
        System.out.println(word1.equals(word2));//false, case sensitive
        System.out.println(word1.equalsIgnoreCase(word2));//true, ignores all case.



    }
}
