package day15_String;

public class StringMethods2 {
    public static void main(String[] args) {
                    //     0123
        String sentence = "Java Programming Language";
        String name = sentence.substring(0,3+1);
        System.out.println("name = " + name);

        System.out.println("------------------");
            //       01234567 9,10,11,12,13,14
        String s2 = "Cybertek School";
        String name2 = s2.substring(0,7+1);
        System.out.println("name2 = " + name2);
        String name3 = s2.substring(9,14+1); // 14+1 unneeded since last of string.
        System.out.println("name3 = " + name3);
        System.out.println("------------------");

        String sentence2 = "Java is a programming language";
        String name4 = sentence2.substring(10);
        System.out.println(name4);

        String name5 = sentence2.substring(10,20+1);
        System.out.println("name5 = " + name5);
        System.out.println("------------------");

        String sentence3 = "Python is an easy language";
        sentence3 = sentence3.replace("Python", "Java");
        System.out.println("sentence3 = " + sentence3);

        String sentence4 = "C# is a programming language, I like learning C#, C# is the best";
        sentence4 = sentence4.replace("C#", "Java");
        System.out.println("sentence4 = " + sentence4);

        String sentence5 = "Dog is friendly, Dog is loyal, I love Dogs";
        sentence5 = sentence5.replace("Dog", "Cat");

        System.out.println("sentence5 = " + sentence5);
        System.out.println("------------------");

        String str ="Batch 23";
        char ch1 = str.charAt(5); //-1 through 200+ is out of range and gives error
        System.out.println("ch1 = " + ch1);

        System.out.println("------------------");
        String str2 = "Cybertek is a great school";
        String s4 = str2.substring(14,19);
        System.out.println("s4 = " + s4);



    }
}
