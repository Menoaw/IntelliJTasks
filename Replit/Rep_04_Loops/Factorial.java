package Rep_04_Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 16; //scan.nextInt();
        //code below here.
        long result = 1;

        for (int i = n; i >=1; i--) {
            result *= i;
        }
        System.out.println(result);

    }
}
/*
In mathematics a **factorial** of a positive integer _n_, denoted by _n_!, is the product of all positive integers less than or equal to _n_.
 Calculate factorial and output result to the console.


Example:

```
input: 5
output: 120

5 * 4 * 3 * 2 * 1
```
 */