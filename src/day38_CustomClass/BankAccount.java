package day38_CustomClass;
/*
BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance

        Actions:
            1. CheckBalance,   2. deposit,  3. withdraw

        requirements:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance
 */
public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

public void setInfo(String accountHolder, long accountNumber, double balance){
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.balance = balance;
}

public void deposit(double amount){
    if (amount <=0){
        System.out.println("Depositing amount can not be negative or zero");
        return;
    }
    System.out.println("Depositing $"+ amount + " to the account " + accountNumber);
    balance+=amount;
}
public void withdraw(double amount){
    if (amount <=0){
        System.out.println("withdraw amount can not be negative or zero");
        return;
    }
    if(balance <=0){
        System.out.println("Insufficient balance");
        return;
    }
    if (amount>balance&&amount>0){
        System.out.println("You have overdrawn, 35$ fee added.");
        balance-=35;
        return;
    }
    System.out.println("Withdrawing $"+amount+" from the account "+accountNumber);
    balance-=amount;
}

public void checkBalance(){
    System.out.println(accountHolder+"'s available balance is $"+balance+".");
}


}
