package Rep_03_String;

import java.util.Scanner;

/*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.


Example:
input: breadjambread
output: jam
```
input: xxbreadjambreadyy
output: jam
```
input: xxbreadapple
output: nothing
```
input: breadbutterbread
output: butter
```
 */
public class GetSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int firstBread = str.indexOf("bread");
        int secondBread = str.lastIndexOf("bread");
        if(str.indexOf("bread")!=str.lastIndexOf("bread")){
            System.out.println(str.substring(firstBread+5,secondBread));
        }else{
            System.out.println("nothing");
        }



    }
}
