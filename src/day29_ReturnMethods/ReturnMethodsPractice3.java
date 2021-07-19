package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodsPractice3 {
    public static void main(String[] args) {


    }



    public static String removeDuplicates(String str){   //"AABBBBCCCCC"
        String result = ""; //ABC
        for (String each:str.split("") ) {// {A,A,B,B,B...}
            if (!result.contains(each)){
                result+= each;
            }

        }



        return result;
    }


}
