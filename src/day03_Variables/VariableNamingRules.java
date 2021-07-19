package day03_Variables;

/*
Variable Naming Rules:
    1. name must be unique at all times.
    2. start with letters, starting with numbers causes compiler errors.
    3. underscore _ and $ allowed, no other special characters.
    4. cannot be java reserved words.
    5. camelCase (recommended)

 */


public class VariableNamingRules {
    public static void main(String[] args) {
        int num = 100;
        // double num = 200; variable name must be unique

        double a1 = 200;
        // double 2a = 200; cannot start with number, causes compiler issues.

        String my_$name = "Matthew";
        //String my name = "Matthew""; space is special character, cannot use in name.

        //char abstract = 'M'; variables cannot be Java reserved words.
        //All reserved words are found on Day 3 presentation slide.



    }


}
