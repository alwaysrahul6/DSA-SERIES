package MULTITHERADING.Counter;

public class counter {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
