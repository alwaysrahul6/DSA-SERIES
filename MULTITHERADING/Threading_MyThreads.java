package MULTITHERADING;

import java.beans.IntrospectionException;

public class Threading_MyThreads extends Thread{
    public Threading_MyThreads(String name){
        super(name);
    }
    @Override
    public void run() {
        try {

           if (getName().equals("NormPriority")){
               Thread.sleep(100000);
           }else {
               Thread.sleep(3000);
               System.out.println(getName() + "Sleeping");
           }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws  InterruptedException {
        Threading_MyThreads t1 = new Threading_MyThreads("HighPriority");
        Threading_MyThreads t2 = new Threading_MyThreads("MinPriority");
        Threading_MyThreads t3 = new Threading_MyThreads("NormPriority");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();;
        System.out.println("Main Thread is intruptting NormPriority");
        t3.interrupt();
    }
}
