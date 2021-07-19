package Replit.Rep_04_Loops;

import java.util.Scanner;

/*
Print the number of times that the string "java" appears anywhere in the given string **word**
Example:
input: javaxjava
output: 2
```
input: javaxjavaapplepearjavaegg
output: 3

 */
public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        String target = "java";
        int javaCount = 0;
        while(word.contains(target)){
            word = word.replaceFirst(target,"");
            javaCount++;

        }

        System.out.println(javaCount);


    }
}
