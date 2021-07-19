package day28_CustomMethods;

public class MethodsWithParameter {
    public static void main(String[] args) {

eligible(1);

    }
    public static void eligible(int age){
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }


}
