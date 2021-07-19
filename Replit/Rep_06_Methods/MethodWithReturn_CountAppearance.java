package Replit.Rep_06_Methods;

import java.util.Scanner;
/*
Create a method that has two parameters of an array of strings and a string and should returns an int.

It counts how many times the given string appears in the array and returns the count.

for example (pseudo code):

```
array = ["a","foo","bar","foo","bla"]
string = "foo"

countAppearance(array , string ) -> 2
```
 */
public class MethodWithReturn_CountAppearance {
    public static int countAppearance(String[] arr,String t){
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(t)) {
                a++;
            }
        }

        return a;
    } //end  count_appearance




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String word = in.next();
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs,word));

    }
}
