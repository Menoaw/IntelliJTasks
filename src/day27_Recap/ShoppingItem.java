package day27_Recap;
/*
Given:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index of "Gloves" (for loop)

        2. find out if "iPad" is contained in the item list(for loop OR each loop)

        3. Print a report of each shopping item (for loop)
            name - price -#ID
 */
public class ShoppingItem {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        for (int i = 0; i < items.length; i++) {
            if(items[i].equals("Gloves")){
                System.out.println("Index number is :"+i);
                break;
            }
        } //1. gloves

        System.out.println("---------------------------");

        boolean isContaining = false;
        for (int i = 0; i < items.length; i++) {

            if(items[i].equals("iPad")){
                isContaining=true;

            }
        }
        System.out.println("This list has an iPad in it: "+isContaining);

        System.out.println("---------------------------");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+" : $"+ prices[i]+" : #"+itemIDs[i]);
        }






    }
}
