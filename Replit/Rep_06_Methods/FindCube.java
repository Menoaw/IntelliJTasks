package Rep_06_Methods;

import java.util.Scanner;

/*
Create a method called **cube**. It is a void method with no arguments.
 Write all required code inside this method in order to read a number from the console and then prints the cubed value of that number:

Example:

```
input: 5

output: 125
```

> hint: cube of a number n = n^3 ->
```
n * n * n
```
 */
public class FindCube {

    //your code here
    public static void cube() {
        Scanner scan = new Scanner (System.in);
        int number = scan.nextInt();
        int cubed = number*number*number;
        System.out.println(cubed);
        scan.close();

    }


    //end cube

    public static void main(String[] args) {

        cube();

    }



}
