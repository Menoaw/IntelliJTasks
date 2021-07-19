package day05_ArithmeticOperators;

/*
1. create a class named Address and declare the following variables:
        name, buildingNumber, streetName, city, state, zipCode

        use string concatenation to display the full address of the person

        Ex:
            Daniel Owens
            7925 Jones Branch Dr
            McLean VA 22102
 */

public class Address {
    public static void main(String[] args) {
        String name = "Daniel Owens",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipcode = "22102";
        int buildingNumber = 7925;

        System.out.println(name);
        System.out.println(buildingNumber + " " + streetName);
        System.out.println(city + " " + state + " " + zipcode);

        System.out.println("---------------");

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " + zipcode);


    }


}
