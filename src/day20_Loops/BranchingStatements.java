package day20_Loops;

public class BranchingStatements {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {

            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("---------------------------------");

        for (int i = 0; i <= 5; i++) {

            if(i<=3&&i>=0){
                continue;
            }
            System.out.println(i);

        }
        System.out.println("---------------------------------");
        for (int i = 0; i <= 10 ; i++) {
            if(i%2==0){
                continue;
            } System.out.println(i);
        }
        System.out.println("---------------------------------");
        for (int i = 0; i <= 100 ; i++) {
            if(i%15!=0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        for (char i = 'A'; i <='Z' ; i++) {
            if(i=='D' || i=='T' || i=='X'){
                continue;
            }System.out.print(i+" ");
        }



    }
}
