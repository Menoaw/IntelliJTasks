package Rep_02_Statements;

import java.util.Scanner;
/*
Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.
 - If item is not in the list, display message: _**"Invalid item!"**_.
 - If price is more than 100$, display message: _**"Sorry, not enough funds on your gift card!".**_

> **_List of items_**
> Blanket - 60$
> Charger - 15$
> Hat - 25$
> Headphones - 30$
> Laptop - 200$
> Pants - 50$
> Pillow - 40$
> Smartphone - 1000$
> Socks - 5$
> USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

```
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
```

```
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
```


```
input: Laptop
Output:
Sorry, not enough funds on your gift card!
```

```
input: Cupcake
output: Invalid item!
```
 */
public class GiftCard {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String items = scan.nextLine();
        int balance = 100;
        if(items.equals("Blanket")){
            balance= balance-60;
            if(balance<0){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else {
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + balance + "$");
            }
        }else if(items.equals("Charger")){
            balance = balance - 15;
            if(balance<0){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else {
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }
        }else if(items.equals("Hat")){
            balance = balance - 25;
            if(balance<0){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else {
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + balance + "$");
            }
        }else if(items.equals("Headphones")){
            balance = balance - 30;
            if(balance<0){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else {
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + balance + "$");
            }
        }else if(items.equals("Laptop")){
            balance = balance - 200;
            if(balance<0){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else {
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }
        }else if(items.equals("Pants")){
            balance = balance - 50;
            if(balance<0){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else {
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + balance + "$");
            }
        }else if(items.equals("Pillow")){
            balance = balance - 40;
            if(balance<0){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else {
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + balance + "$");
            }
        }else if(items.equals("Smartphone")){
            balance = balance - 1000;
            if(balance<0){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else {
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }
        }else if(items.equals("Socks")){
            balance = balance - 5;
            if(balance<0){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else {
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }
        }else if(items.equals("USB cable")){
            balance = balance - 10;
            if(balance<0){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else {
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }

        }else {
            System.out.println("Invalid item!");
        }



    }
}
