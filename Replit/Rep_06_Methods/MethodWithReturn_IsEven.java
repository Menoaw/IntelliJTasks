package Rep_06_Methods;

import java.util.Scanner;

/*
**isEven** accepts a number and checks if it is even. If the given number is even return true, otherwise return false.

Examples:

```
isEven(1) --> false
```

```
isEven(8) --> true
```


 */
public class MethodWithReturn_IsEven {

    public static boolean isEven(int n) {
        boolean a = true;
        if(n%2==0){
            a = true;
        }else{
            a = false;
        }


        return a;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }


}
