package day39_CustomClass_Statics.carpetTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CarPetObjects {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(5,2, 3.5, false);
        carpets[1].customOrder(4.5,3.5, 4.5, false);
        carpets[2].customOrder(6,1, 6.5, true);
        carpets[3].customOrder(5.5,3.5, 8.5, false);
        carpets[4].customOrder(10,2, 7.5, true);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll( Arrays.asList(carpets) ); // adding all the carpets
        persianCarpets.removeIf( carpet ->  !carpet.isPersian ); //remove all the carpets that are not persian

        ArrayList<Carpet> regularCarpets = new ArrayList<>( Arrays.asList(carpets)  );
        regularCarpets.removeIf( p -> p.isPersian  ); //remove all the carpets that are persian

        /*
        for(Carpet each : carpets ){
            if(each.isPersian){
                persianCarpets.add(each);
            }else{
                regularCarpets.add(each);
            }
        }
        */

        System.out.println("Total number of persian carpets: "+ persianCarpets.size());
        System.out.println("Total number of regular carpets: "+ regularCarpets.size());


        for (Carpet persianCarpet : persianCarpets) {
            System.out.println(persianCarpet);
        }





    }

}

/*
create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets
        write a program to add all the persian Carpets into the list of persianCarpets, and add all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets
 */