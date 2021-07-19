package Replit.Rep_04_Loops;

import java.util.Scanner;

/*
Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.
Example:
input: abc hi how hi
output: 2
```
input: hi code java please
output: 1
 */
public class CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word = "hi";
        int count = 0;
        for (int i = 0; i <= str.length()-word.length(); i++) {

           String test= str.substring(i,i+word.length());

        if(test.contains("hi")){
            count = count+1;
        }

        }
        System.out.println(count);





    }
}
