package Rep_02_Statements;

import java.util.Scanner;

/*
A fast food company has two main order types, burger meal and chicken meal.

Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.

- If the order is burger price is 10.0
- If the order is chicken price is 10.0
- If the order is soda price is 2.0
- If the order is fries price is 3.5

hint: or operator in java is  ||

Examples:

```
burger

10.0
```

```
chicken

10.0
```

```
soda

2.0
```



 */
public class BurgerOrChicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String in = s.next();

        if(in.equals("burger")||in.equals("chicken")){
            System.out.println(10.0);
        }else if(in.equalsIgnoreCase("soda")){
            System.out.println(2.0);
        }else if(in.equalsIgnoreCase("fries")){
            System.out.println(3.5);
        }



    }
}
