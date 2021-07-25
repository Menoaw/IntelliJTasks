package day34_LocalDateTime_Wrapper;

public class WrapperClassIntro {
    public static void main(String[] args) {

        short s = 10;
        int num = s;
        Integer num2 = num; // cannot accept any other forms of number BUT given wrapper.
        System.out.println("--------------------------------------------");

        char ch = '@';
        Character ch2 = ch; //Autoboxing ==> Character ch2 = (Character) ch; Casting happens.

        Byte b1 = 10;       //Unboxing, can go from Wrapper Class to ANY primitive.
        byte b2 = b1;
        short b3 = b1;
        int b4 = b1;



    }
}
