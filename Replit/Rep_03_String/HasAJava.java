package Replit.Rep_03_String;
/*
Given a string **_word_**, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.


Example:

```
input: javapython

output: true
```

```
input: cjavac++

output: true
```

```
input: c#javaruby

output: false
```
 */

import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //Code Below
        int indexOfJava = word.indexOf("java");
        if(word.contains("java")){
            if(indexOfJava==0 || indexOfJava==1){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("false");
        }

    }
}
