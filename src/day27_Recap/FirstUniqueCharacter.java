package day27_Recap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

        String str = "aaabccddefggggh";
        //indexOf('a') ==> 0
        //lastIndexOf('a') ==> 2
/*
        for (int i = 0; i < str.length(); i++) {
            char each = str.replace(" ",""){ //each character, removes any spaces.
            System.out.print(each);
        }
*/


        for (char each:str.replace(" ","").toCharArray()) {

            if(str.indexOf(each)==str.lastIndexOf(each)){
                System.out.println(each);
                break; // this shows only first, if removed it will list all uniques
            }
        }







    }
}
