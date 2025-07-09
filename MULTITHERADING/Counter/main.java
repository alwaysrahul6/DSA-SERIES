package MULTITHERADING.Counter;

public class main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Runnable task  = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(50);
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t12 = new Thread(task, "Thread 2");
        t1.start();
        t12.start();
    }

}
