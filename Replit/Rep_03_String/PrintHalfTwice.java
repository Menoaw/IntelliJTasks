package Replit.Rep_03_String;

import java.util.Scanner;

/*
Write a program that will print out first half of the word twice.


Example:

```
input: java

output: jaja
```
```
input: unity

output: unun
```
 */
public class PrintHalfTwice {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //WRITE YOUR CODE HERE

            int length = word.length();
            int firstHalf = length / 2;
            String output = "" + word.substring(0, firstHalf) + word.substring(0, firstHalf);

            System.out.println(output);


        }
    }

