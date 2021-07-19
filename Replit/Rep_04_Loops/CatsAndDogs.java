package Replit.Rep_04_Loops;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        //String word = scan.next();
        String word = "dogcatcatdog";
        //code below here.

        do {
            if (word.contains("cat")) {
                word = word.replaceFirst("cat", " ");
                countOfCats++;
            } else if (word.contains("dog")) {
                word = word.replaceFirst("dog", " ");
                countOfDogs++;
            }
        } while (word.contains("cat") || word.contains("dog"));
        if (countOfCats == countOfDogs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
/*
Print true if the string _"cat"_ and _"dog"_ appear the same number of times in the given string _word_.


Example:

```
input: catdog
output: true
```

Example:

```
input: catcat
output: false
```

Example:

```
input: cat-cheetah-dog-cat
output: false
```
 */