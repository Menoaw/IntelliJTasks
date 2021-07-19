package Rep_03_String;

import java.util.Scanner;

public class MergeThem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        if (word1.length()==3&&word2.length()==3){
            System.out.println(""+word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1)+""+word2.charAt(1)+""+word1.charAt(2)+""+word2.charAt(2));
        }else{
            System.out.println("cannot merge");
        }



    }
}
