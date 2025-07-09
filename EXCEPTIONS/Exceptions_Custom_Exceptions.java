package EXCEPTIONS;

public class Exceptions_Custom_Exceptions {
    public static class BankAccopunt{
        private static double balance;

        public BankAccopunt (double amount){
            balance = amount;
        }

        public static void withdraw(double amount) throws Exception {
            if (amount > balance){
                throw new Exceptions_Insufficents_Funds_Exceptions();
            }
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccopunt bankAccopunt = new BankAccopunt(10);
        try {
            BankAccopunt.withdraw(11);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
