package MULTITHERADING;

public class THREAD_Methods  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<=5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        THREAD_Methods t1 = new THREAD_Methods();
        t1.start();
        t1.join();
        System.out.println(t1.getState());
        System.out.println("Hiii");

        /// start run sleep join setpriority , intrupted 
    }
}
