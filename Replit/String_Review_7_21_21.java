package Replit;

public class String_Review_7_21_21 {
    public static void main(String[] args) {
                    //01234567891011
        String str = "This is Java";
        String str2 = " Nope";

        //charAt() - gets character at given index.
        System.out.println(str.charAt(3)); //s
        System.out.println("-----------------------------");
        //length() - gets length of the string, not index.
        System.out.println(str.length()); //12
        System.out.println("-----------------------------");
        //concat() - he said this is rarely used, acts as concatanation +
        System.out.println(str.concat(str2)); // str + str1 "This is Java Nope"
        System.out.println("-----------------------------");
        //toLowerCase()
        System.out.println(str.toLowerCase());
        System.out.println("-----------------------------");
        //toUpperCase()
        System.out.println(str.toUpperCase());
        System.out.println("-----------------------------");
        //trim() - gets rid of all spaces before and after a string. DOES NOT AFFECT MIDDLE OF STRING
        System.out.println(str2.trim());
        System.out.println("-----------------------------");
        //substring() -
        System.out.println(str.substring(0,4)); //This - index 4 is not shown, so 0-3 is shown.
        System.out.println(str.substring(5)); //is Java
        System.out.println("-----------------------------");
        //replace()
        String str3 = str.replace("Java","Python"); //This is Python
        System.out.println(str3);
        System.out.println("-----------------------------");
        //replaceFirst() - used for counting, takes FIRST set of characters matching and replaces.
        String str4 = "This is the song that never ends, it goes on and on and on and on";
        str4 = str4.replaceFirst("on","");// count++;
        System.out.println(str4);
        System.out.println("-----------------------------");

        //              012345678901
        //String str = "This is Java";

        //indexOf() - gives first index number of first str searched for located in str.
        //System.out.println(str.indexOf(" is")+1); //5
        System.out.println(str.indexOf("is"));//2
        System.out.println("-----------------------------");
        //lastIndexOf() - gives first index number of last str searched for located in str.
        System.out.println(str.lastIndexOf("is"));//5
        System.out.println("-----------------------------");
        //isEmpty() - boolean, true or false
        String str5 = "";
        System.out.println(str.isEmpty());//false
        System.out.println(str5.isEmpty());//true
        System.out.println("-----------------------------");
        //equals() - true or false if EXACT equal - also can use ==
        System.out.println(str.equals(str2)); //false
        System.out.println(str.equals(str));//true
        String str6 = "This is Java";
        System.out.println(str.equals(str6));
        System.out.println("-----------------------------");
        //equalsIgnoreCase() - boolean response true false, ignores case sensitivity
        String str7 = "ThIs Is JaVa";
        System.out.println(str6.equalsIgnoreCase(str7));
        System.out.println("-----------------------------");
        //contains() - boolean response true or false, case sensitive
        //System.out.println(str.toUpperCase().contains("JAVA"));//true since all caps. can also use .toLowerCase()
        System.out.println(str.contains("Java"));//true since correct case.
        System.out.println("-----------------------------");
        //startsWith() - boolean - does string start with given character.
        System.out.println(str.startsWith("Java"));//false
        System.out.println(str.startsWith("This"));//true
        System.out.println("-----------------------------");
        //endsWith() - boolean - does string end with given character.
        System.out.println(str.endsWith("a"));//true
        System.out.println(str.endsWith("Java"));//true
        System.out.println(str.endsWith("isJava"));//false

    }
}
