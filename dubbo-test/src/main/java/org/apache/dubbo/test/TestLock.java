package org.apache.dubbo.test;


public class TestLock implements Runnable{

    public synchronized void get(){
        System.out.println(Thread.currentThread().getId());
        set();
    }

    public synchronized void set(){
        System.out.println(Thread.currentThread().getId());
    }

    @Override
    public void run() {
        get();
    }

    public static void main(String[] args) {
        Test ss=new Test();
        new Thread(String.valueOf(ss)).start();
        new Thread(String.valueOf(ss)).start();
    }
}

