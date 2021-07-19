package day29_ReturnMethods;

public class ReturnMethodsPractice {
    public static void main(String[] args) {

    int max = max(10,20);
        System.out.println(max*2);
    }

    public static int max(int a,int b){
        int max = 0;
        if (a>b){
            max = a;
        }else{
            max = b;
        }
        return max;
    }


}
