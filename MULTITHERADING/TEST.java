package MULTITHERADING;

public class TEST {
    public static void main(String[] args) {
        world  world = new world();
        Thread t1 = new Thread(world);
        t1.start();
        for (; ;)
        System.out.println(Thread.currentThread().getName());
    }
}
