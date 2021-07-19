package Replit.Rep_04_Loops;

import java.util.Scanner;

/*
Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.
Example:
input:
A
Z
output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
```
input:
a
f
output: abcdef
```
input:
a
d
output: abcd
```
input:
B
O
output: BCDEFGHIJKLMNO
 */
public class PrintLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        //code below here
        String str = "";
        for (char i = start; i <= end; i++) {
            str+=""+i  ;
        }
        System.out.println(""+str);



    }
}
