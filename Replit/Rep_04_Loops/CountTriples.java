package Replit.Rep_04_Loops;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
        //WRITE YOUR CODE HERE

        for (int i = 0; i < str.length() - 2; i++) {
            String eachTrip = str.substring(i, i + 3);
            String tripAtChar = str.substring(i, i + 1) + str.substring(i, i + 1) + str.substring(i, i + 1) + "";
            if (eachTrip.equals(tripAtChar)) {
                count++;
            }
            System.out.println(eachTrip);
        }
        System.out.println(count);
    }


}

/*
We'll say that a "triple" in a string is a char appearing three times in a row.
Print out the number of triples in the given string. The triples may overlap.
Example:
input: abcXXXabc
output: 1
```
input: xxxabyyyycd
output: 3
```
input: java
output: 0
 */