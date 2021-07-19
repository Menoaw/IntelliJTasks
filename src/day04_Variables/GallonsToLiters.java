package day04_Variables;


/*
    3. create a class called GalonsToLiters, and write a program that can convert the gallons tto
            Ex:
                galon = 10;

           Hint: 1 gallon = 3.78541 liters
 */
class GallonsToLiters {
    public static void main(String[] args) {
        int gallon = 9;
        double liter = gallon*3.78541;


        System.out.print(gallon);
        System.out.print(" Gallon Is Equal To ");
        System.out.print(liter);
        System.out.println(" Liters");
        System.out.println("--------------");
        System.out.println(gallon + " Gallon is Equal to " + liter + " Liters.");
        System.out.println("--------------");
        System.out.println();
        System.out.println("liter = " + liter);
        System.out.println("gallon = " + gallon);


    }


}
