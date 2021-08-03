package day37_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Kangal";
        dog1.gender = "Female";
        dog1.breed = "Kangal";
        dog1.age = 5;
        dog1.size = "large";
        dog1.color = "brown";
        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.setInfo("Bobby","Shepard","Female","Black","Large",3);

        System.out.println(dog2);

        dog1.bark();
        dog2.bark();
        System.out.println("---------------------------------");
        dog1.eat("pizza");
        dog2.eat("steak");
        dog1.drink("water");
        dog2.play();
        System.out.println("---------------------------------");
        dog2.getInfo();
        System.out.println("---------------------------------");
        dog1.getInfo();

        Dog[] dogs = {dog1,dog2};

        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.addAll(Arrays.asList(dog1,dog2));
        System.out.println(dogsList);


    }
}
