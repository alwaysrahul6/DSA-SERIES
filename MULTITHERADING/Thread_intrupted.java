package MULTITHERADING;

public class Thread_intrupted extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is Running....");
        }catch (InterruptedException e){
            System.out.println("Thread intrupted" + e);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread_intrupted t1 = new Thread_intrupted();
        t1.start();
        t1.interrupt();
    }
}
