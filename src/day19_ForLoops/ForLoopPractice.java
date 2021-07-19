package day19_ForLoops;

public class ForLoopPractice {
    public static void main(String[] args) {

/*
        // for (int i = 0; i <=1000 ; i++) {
        // System.out.println(i);
        //}
        String word = "aabbccdd";
        String result = "";
        for (int i = 0; i <= word.length()-1;i++ ) {
            if (!result.contains("" + word.charAt(i))) { //"a"
                result += word.charAt(i);
            }
            System.out.println("result = " + result);
*/

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }

        }
        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        System.out.println("------------------------");
        String odds ="";
        String evens = "";
        for (int i = 0; i < 101; i++) {
            if(i%2 !=0){
                odds += i+" ";
            }else{
                evens +=i+" ";
            }

        }
        System.out.println("evens = " + evens);
        System.out.println("odds = " + odds);

        System.out.println("------------------");


    }
}
