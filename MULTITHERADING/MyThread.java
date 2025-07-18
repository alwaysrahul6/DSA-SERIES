package MULTITHERADING;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception Handled");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
