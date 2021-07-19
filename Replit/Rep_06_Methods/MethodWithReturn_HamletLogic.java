package Rep_06_Methods;

import java.util.Scanner;

/*
The famous quote is "_**to be or not to be**_" is a classic example of boolean logic.

the **hamletQuote** method only returns `true` if one or both of the boolean parameters is `true`.

Examples:

```
hamletQuote(true, false)

returns true
```

```
hamletQuote(false,true)

returns true
```

```
hamletQuote(true,true)

returns true
```

```
hamletQuote(false,false)

returns false
```

hint: use the truth table for this one, this can be done with one if and a logical operator.
 */
public class MethodWithReturn_HamletLogic {

    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        // your code here
        boolean a = true;
if(toBe==true||notToBe==true){
    a = true;
}else{
    a = false;
}
return a;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));

    }
}


