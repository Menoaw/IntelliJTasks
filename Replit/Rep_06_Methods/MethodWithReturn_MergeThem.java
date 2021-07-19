package Replit.Rep_06_Methods;

import java.util.Scanner;
/*
Write a method **mergeStrings** that will return the strings merged, one letter at a time, starting with `one`.   Please note `one` and `two` can be of different lengths.

Examples:
```
s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
```

```
mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
```
 */
public class MethodWithReturn_MergeThem {
    public static String mergeStrings(String one, String two) {
        String merged ="";
        int j = 0;
        if (one.length()<two.length()) {
            for (int i = 0; i < one.length(); i++) {
                merged += one.charAt(i);
                merged += two.charAt(i);
                j++;
            }
            merged += two.substring(j);
        }else{
            for (int i = 0; i < two.length(); i++) {
                merged += one.charAt(i);
                merged += two.charAt(i);
                j++;
            }
            merged += one.substring(j);
        }


        return merged;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }

}
