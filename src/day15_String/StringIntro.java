package day15_String;


public class StringIntro {
    public static void main(String[] args) {


        String str1 = "Matt"; //string literal, add to String Pool,no duplicated objects
        System.out.println("str1 = " + str1);
        str1 = "Duh";
        System.out.println("str1 = " + str1);
        String str2 = new String ("Matt"); //string new keyword, add to Java Heap, creates duplicated objects


        System.out.println(str1 == str2);
        System.out.println(str2 == str1);
    }
}
