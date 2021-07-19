package day11_Switch;
/*
switch only checks equal value, does not accept oolean
keywords: switch, case, default, break

syntax:
    switch(data){
        case data 1:
                statement 1;
                break;
        case data 2:
                statement2;
                break;
        case data 3:
                statement3;
                break;
        default:
                statement4;
                break;
    }


 */
public class SwitchStatements {
    public static void main(String[] args) {
        int number = 5;

        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;

        }







    }

}
