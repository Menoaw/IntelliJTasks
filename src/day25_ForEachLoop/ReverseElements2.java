package day25_ForEachLoop;
/*
2. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};
            output:
                2
 */
public class ReverseElements2 {
    public static void main(String[] args) {


        String[] ar = {"Java", "Python", "C#"};
        for (String element:ar) {
            String reverse= "";
            for (int i = element.length() - 1; i >= 0; i--) {
                reverse += element.charAt(i);
            }
            System.out.println(reverse);
        }









    }
}
