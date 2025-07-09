package MULTITHERADING.Counter;

public class myThread extends Thread {
    private counter counter;

    public myThread(counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0;i < 1000;i++){
            counter.increment();
        }
    }
}
