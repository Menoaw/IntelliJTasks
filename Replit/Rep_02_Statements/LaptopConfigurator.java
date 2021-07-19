package Replit.Rep_02_Statements;

import java.util.Scanner;

/*
Write a program that will calculate laptop price based on the components.

First ask user for a screen size.
- If screen size is equals to 13.3, add  $200 to the laptop price.
- If screen size is equals to  15.0 - add  $300 to the laptop price.
- If screen size is equals to  17.3 - add  $400 to the laptop price.

Then ask user for CPU type.
- If CPU type equals to i3, add  $150 to the laptop price.
- If CPU type equals to i5, add  $250 to the laptop price.
- If CPU type equals to i7, add  $350 to the laptop price.

Then ask user for RAM size.
- Add  $50 for every 4GB of ram to the laptop price.

Then, ask user for storage type. There are 2 options: SSD and HDD.
- If it's HDD - add $50 to the laptop price for every 500gb.
- If it's SSD - add $100 to the laptop price for every 500GB.

Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.
- Add $100 if it's FULLHD screen
- Add $200 if it's 4K screen.

Example:

```
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0
```

Example #2


```
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i3
Display message: Select RAM size:
input: 4
Display message: Select storage type:
input: HDD
Display message: Enter memory size:
input: 500
Display message: Enter screen resolution:
input: FULLHD
Display message: Laptop price is: $550.0
```
 */
public class LaptopConfigurator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double laptopPrice = 0;


        System.out.println("Select screen size:");
        String screenSize = scan.next();
        if(screenSize.equals("13.3")){
            laptopPrice=laptopPrice+200;
        }else if(screenSize.equals("15.0")){
            laptopPrice=laptopPrice+300;
        }else if(screenSize.equals("17.3")){
            laptopPrice=laptopPrice+400;
        }

        System.out.println("Select CPU type:");
        String cpuType = scan.next();
        if(cpuType.equals("i3")){
            laptopPrice=laptopPrice+150;
        }else if(cpuType.equals("i5")){
            laptopPrice=laptopPrice+250;
        }else if(cpuType.equals("i7")){
            laptopPrice=laptopPrice+350;
        }

        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
        laptopPrice=laptopPrice+((ramSize/4)*50);

        System.out.println("Select storage type:");
        String storageType = scan.next();
        if(storageType.equalsIgnoreCase("HDD")){
            System.out.println("Enter memory size:");
            int memSize = scan.nextInt();
            laptopPrice=laptopPrice+(50*(memSize/500));
        }else if(storageType.equalsIgnoreCase("SSD")) {
            System.out.println("Enter memory size:");
            int memSize = scan.nextInt();
            laptopPrice = laptopPrice + (100 * (memSize / 500));
        }

        System.out.println("Enter screen resolution:");
        String screenResolution = scan.next();
        if(screenResolution.equalsIgnoreCase("fullhd")){
            laptopPrice=laptopPrice+100;
        }else if(screenResolution.equalsIgnoreCase("4k")){
            laptopPrice=laptopPrice+200;
        }
        System.out.println("Laptop price is: $"+laptopPrice);





    }
}
