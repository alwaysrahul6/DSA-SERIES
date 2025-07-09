package MULTITHERADING;

public class Thread_yeild_method extends Thread {
    public Thread_yeild_method(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0;i< 5;i++){
            System.out.println(Thread.currentThread().getName() + "is Running");
            Thread.yield(); /// chances deta hai ki dusra thread bhi kaam kare
        }
    }

    public static void main(String[] args) {
        Thread_yeild_method t1 = new Thread_yeild_method("t1");
        Thread_yeild_method t2 = new Thread_yeild_method("t2");
        t1.start();
        t2.start();
    }
}
