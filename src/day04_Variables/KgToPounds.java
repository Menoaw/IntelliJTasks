package day04_Variables;


/*
2. create a class called KgToPounds, and write a program that can convert the given Kg to pound and print the result
            Ex:
               if kg = 10;

                output:
                    22.0462

               Hint: 1 kg = 2.2 pounds
 */
public class KgToPounds {
    public static void main(String[] args) {

        int kg = 10;
        double pound = kg*2.2;
        System.out.print(kg);
        System.out.print(" KGs is Equal to ");
        System.out.print(pound);
        System.out.println(" Pounds.");

        System.out.println("--------------");

        System.out.println(kg + " Kgs is Equal to " + pound + " Pounds.");

        System.out.println();
        System.out.println("--------------");
        System.out.println("kg = " + kg);
        System.out.println("pound = " + pound);

    }



}
