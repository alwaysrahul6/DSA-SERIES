package MULTITHERADING;

public class world implements Runnable {
    @Override
    public void run() {
        for (; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
