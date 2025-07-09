package MULTITHERADING;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrantexample {

    private final Lock lock = new ReentrantLock();

    private void outerMethod(){
        lock.lock();
        try {
            System.out.println("Outer method");
            innermethod();
        }finally {
            lock.unlock();
        }
    }

    private void innermethod(){
        lock.lock();
        try {
            System.out.println("inner method");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Reentrantexample reentrantexample = new Reentrantexample();
        reentrantexample.outerMethod();
    }
}
