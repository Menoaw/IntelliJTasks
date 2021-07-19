package day12_Scanner;
/*
3. Given a number of people on the ship determine how many need to be crew members and how many can be passengers.
        Print how many of each type there should be.

            Total: 50 | 20 crew, 30 passengers
            Total: 75 | 25 crew, 50 passengers
            Total: 100 | 30 crew, 70 passengers
            Any other number of people on the ship is not valid
 */
public class peopleOnShip {
    public static void main(String[] args) {
        int people = 100;
        String total ="";

        switch(people){
            case 50:
                total="20 crew, 30 passengers";
                break;
            case 75:
                total="25 crew, 50 passengers";
                break;
            case 100:
                total="30 crew, 70 passengers";
                break;
            default:
                total= "Invalid amount of people";


        }
        System.out.println(total);

    }
}
