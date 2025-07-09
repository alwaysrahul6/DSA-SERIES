package EXCEPTIONS;

/// Custom Exceptions 1
class InsufficientFunds extends Exception{
    public InsufficientFunds(String message){
        super(message);
    }
}

/// Custom Exceptions 2

class CardInvalid extends Exception{
    public CardInvalid(String message){
        super(message);
    }
}
/// Custom Exceptions 3

class MachineError extends Exception{
    public MachineError(String message){
        super(message);
    }
}

/// Custom Exceptions 4

class TooManyAttempt extends Exception{
    public TooManyAttempt(String message){
        super(message);
    }
}

/// Custom Exceptions 5

class NegativeAmountExceptions extends Exception{
    public NegativeAmountExceptions(String message){
        super(message);
    }
}

class ATM{
    private final boolean isCardValid;
    private double balance;
    private final boolean isMachineWorking;

    public ATM(boolean isCardValid,boolean isMachineWorking,double balance){
        this.balance = balance;
        this.isCardValid = isCardValid;
        this.isMachineWorking = isMachineWorking;
    }
    public void withdraw(double amount) throws CardInvalid,InsufficientFunds,MachineError,TooManyAttempt , NegativeAmountExceptions{
        if (!isMachineWorking){
            throw  new MachineError("Machine is Not Working Please Try After Again Another time ");
        }

        if (!isCardValid){
            throw new CardInvalid("Your Card Is Invalid Please Try Another Card");
        }

        if (amount > balance){
            throw new InsufficientFunds("Insufficent Funds");
        }
        balance-=amount;
        System.out.println("Transction Succefully:" + amount);

        if (amount > 1000000){
            throw new TooManyAttempt("Daily Limit Reached");
        }

        if (amount < 0){
            throw new NegativeAmountExceptions("Please Amount Insert Greater Than 0");
        }
    }
    // Getter to show current balance
    public double getBalance() {
        return balance;
    }
}

public class Exceptions_ATM {
    public static void main(String[] args) {
        ATM atm = new ATM(true,true,5000);
        try {
            atm.withdraw(-2);
            System.out.println("Available  Balance is " + atm.getBalance());
        }catch (CardInvalid e){
            System.out.println("card error" + e.getMessage());
        }catch (InsufficientFunds e){
            System.out.println("Balance error " +e.getMessage() );
        }catch (MachineError e){
            System.out.println("Machine Error" + e.getMessage());
        }catch (TooManyAttempt e){
            System.out.println("Too many Atempt" + e.getMessage());
        }catch (NegativeAmountExceptions e){
            System.out.println("Negative Amount " + e.getMessage());
        }
    }
}
