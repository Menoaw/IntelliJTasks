package day07_ShortHand_Relational;

public class ShortHandOperators {
    public static void main(String[] args) {
        String name1 = "Muhtar";
        String name2 = "Mehmet";
        String name3 = name2;
        name2 = name1; //name2 = muhtar
        name1 = name3; // name 1 = mehmet

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
        System.out.println("-----------------");

        int a = 200;
        System.out.println("a = " + a);
        int b = a;
        a = 100+300;
        System.out.println("a = " + a);

        System.out.println("-----------------");

        int balance = 300; //balance = 300
        // balance = balance + 200; (long version)
        balance+=200;  //balance= 500
        balance+=1000; //balance 1500
        System.out.println("balance = " + balance);

        System.out.println("-----------------");
        String school = "Cybertek";
        school+= " School";
        System.out.println("school = " + school);
        System.out.println("-----------------");
        String name = "John";
        String lastName = "Daniel";
        name+= " " + lastName;
        System.out.println("name = " + name);
        System.out.println("-----------------");
        //withdraw:
        balance-= 300;
        System.out.println("balance = " + balance);
        balance-= 1000;
        System.out.println("balance = " + balance);
        System.out.println("-----------------");
        //*=
        double salary = 100000;
        //salary = salary * 2;
        salary*= 2;
        System.out.println("salary = $" + salary);
        salary*=1.5;
        System.out.println("salary = $" + salary);
        //0.65 = takehome after tax
        salary*=0.65;
        System.out.println("salary = $" + salary);
        System.out.println("-----------------");
        // /=
        int slices = 10;
        slices/= 5;
        System.out.println("slices = " + slices);
        System.out.println("-----------------");
        // %= cents ===> 4 quarters and 5 cents
        int cents = 105;
        int quarters = cents/25;
        System.out.println("quarters = " + quarters);
        cents %= 25;
        System.out.println("cents = " + cents);
        System.out.println("-----------------");






    }
}
