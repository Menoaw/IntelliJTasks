package Rep_04_Loops;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        //code below here.
        int javaCount = 0;
        int pythonCount= 0;
        do{
            if (sentence.contains("java")) {
                sentence = sentence.replaceFirst("java", "");
                javaCount++;
            }else if(sentence.contains("python")){
                sentence = sentence.replaceFirst("python","");
                pythonCount++;
            }

        }while (sentence.contains("java")|| sentence.contains("python"));

        if(javaCount==pythonCount){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:


```
input: We study java not python

output: true
```


Example:


```
input: What's the difference between java, javascript and python?

output: false
```
 */