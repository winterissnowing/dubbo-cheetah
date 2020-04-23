package org.apache.dubbo.test;

public class SynchronizedDemo implements Runnable {
    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SynchronizedDemo());
            thread.start();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("result: " + count);
    }

    @Override
    public void run() {
        synchronized (SynchronizedDemo.class) {
            for (int i = 0; i < 1000000; i++)
                count++;
        }
    }
}

/*
public class SynchronizedDemo  implements Runnable{
    // 非静态方法加锁
    public synchronized void isSyncA(){
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() +" -- "+ i);
        }
    }

    public synchronized void isSyncB(){}

    // 静态方法加锁
    public static synchronized void cSyncA(){}

    public static synchronized void cSyncB(){}
    public static void main(String[] args) {
        SynchronizedDemo x = new SynchronizedDemo();
        Thread thread1 = new Thread(x);
        Thread thread2 = new Thread(x);
        thread1.start();
        thread2.start();
    }

    public  void run () {
        this.isSyncA();
    }
}
    */



