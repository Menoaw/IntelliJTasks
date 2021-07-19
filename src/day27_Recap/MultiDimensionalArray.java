package day27_Recap;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[] scrum1 = {"Cat","Dog"};
        String[] scrum2 = {"Hamster","Ferret","Gerbil"};
        String[] scrum3 = {"Goldfish","Rock"};


        String[][] scrumTeams= {scrum1,scrum2,scrum3};

        System.out.println(Arrays.toString(scrumTeams[0]));
        System.out.println(Arrays.deepToString(scrumTeams));

        System.out.println(scrumTeams[1][1]);

        System.out.println("-----------------------------");


        for (String[] eachScrum : scrumTeams) {
            System.out.println(Arrays.toString(eachScrum));
        }
        System.out.println("-----------------------------");
        for(String[] eachScrum:scrumTeams){
            for (String eachMember:eachScrum) {
                System.out.print(eachMember+" ");

            }

        }
        System.out.println("\n-----------------------------");


        for (int i = 0; i < scrumTeams.length; i++) { //shows each member of all arrays
            for (int j = 0; j < scrumTeams[i].length; j++) {
                System.out.println(scrumTeams[i][j]);
            }
        }


        System.out.println("-----------------------------");

        int[] numbers = {1,2,3,4,5}; //{5,2,3,4,1}
        int temp = 0;
        temp = numbers[0];
        numbers[0] = numbers [4];
        numbers [4] = temp;
        System.out.println(Arrays.toString(numbers));

    }
}
