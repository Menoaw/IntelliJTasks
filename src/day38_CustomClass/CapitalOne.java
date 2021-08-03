package day38_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Christian",123456,0);

        account1.checkBalance();
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(999.13);
        account1.checkBalance();
        account1.withdraw(25.13);
        account1.checkBalance();
        account1.withdraw(10);
        account1.checkBalance();
        System.out.println("--------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Ahmed",123,0);
        account2.deposit(1000.1);
        account2.checkBalance();


    }
}
