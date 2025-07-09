package OOPS;
class BankAccount{
    private double balance; /// doesnt accessed directly
    public  double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount > 0 ){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if (amount >  0 && amount < balance){
            balance-=amount;
        }else System.out.println("Invalid Transction");
    }
}

class student{
    private String Employname;
    public String getName(){
        return Employname;
    }

}

public class ENCAPSULATION {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        System.out.println("Current Balace of The account " + account.getBalance());
        account.withdraw(4000);
        System.out.println("Current Balance of the account " + account.getBalance());
    }
}
