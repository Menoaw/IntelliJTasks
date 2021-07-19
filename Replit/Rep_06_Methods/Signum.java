package Rep_06_Methods;

import java.util.Scanner;

/*
Given a method **sign** write the code so that its takes a number argument and tells you if its positive, negative or zero.
for example :
sign(5)  => positive
``
sign(-30) => negative
```
sign(0)  => zero
 */
public class Signum {
    public static void sign(int n){
        //your code here:
        String str = "";
        if (n>0){
            str = "positive";
        }else if (n<0){
            str = "negative";
        }else if (n==0){
            str = "zero";
        }
        System.out.println(str);

    }


    // DO not change:
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }
}
