package Replit.Rep_06_Methods;

import java.util.Scanner;

/*
Finish the method **max** which has two parameters, x and max.
  -  if **x** is bigger than **max** return `x`
  -  if **max** is bigger than **x** return `max`
  -  all other cases return `x`

Example:

```
max(1,10) -> 10
```

```
max(11,5) -> 11
```
 */
public class MethodWithReturn_Max {
    public static int max(int x, int max) {
        // Code here
        int a = 0;
        if(x>max){
            a = x;
        }else if(max>x){
            a=max;
        }else{
            a = x;
        }
return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }
}
