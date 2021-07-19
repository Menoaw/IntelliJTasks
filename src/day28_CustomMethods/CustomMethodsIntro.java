package day28_CustomMethods;



public class CustomMethodsIntro {
    public static void main(String[] args) {

        printHello5Times();
        System.out.println("name");
        printHello5Times();
        System.out.println("School");
        printHello5Times();


    }

    public static void printHello5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello");
        }
    }

}
