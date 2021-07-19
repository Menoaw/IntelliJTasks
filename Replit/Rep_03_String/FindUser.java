package Replit.Rep_03_String;

import java.util.Scanner;

/*
Write a program that will look up a user.


Assume that you have only 2 users: Max Payne and Alan Wake.  First, ask user to enter full name. Display message: "Enter full name:". Then take input from user. If name is equals to either "Max Payne" or "Alan Wake",  display message: "User found!". Otherwise,  display message: "User not found!". _`Please make your search case insensitive!`_

Example:


```
Display message: Enter full name:
```

```
input: Max Payne
```

```
Display message: User found!
```
 */
public class FindUser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String user = "";
        System.out.println("Enter full name:");
        user = scan.nextLine();
        if(user.equalsIgnoreCase("max payne")||user.equalsIgnoreCase("alan wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }




    }
}
