package day29_ReturnMethods;

public class ReturnMethods {
    public static void main(String[] args) {
        String str = "Python";

        //isPalindrome(str);
    }

    public static String reverse(String str){ //change out void for dataType e.g. String, int, etc.
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
       // System.out.println(result);
        return result; // NEED THIS FOR RETURN, makes available outside method.
    }

  /*
    public static boolean isPalindrome(String str){

        String reversedStr = reverse(str);
        if(reversedStr.equalsIgnoreCase(str)){
            boolean isPalindrome = true;

        }else{
            boolean isPalindrome = false;

        }
        return isPalindrome(str);
   */
    }

