package MULTITHERADING.Counter;

public class test {
    public static void main(String[] args) {
        counter counter = new counter();
        myThread t1 = new myThread(counter);
        myThread t2 = new myThread(counter);
        t1.start();;
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {

        }
        System.out.println(counter.getCount());
    }
}
