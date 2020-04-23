package org.apache.dubbo.test;



class Lock{
    private boolean isLocked = false;
    public synchronized void lock() throws InterruptedException{
        while(isLocked){
            wait();
        }
        isLocked = true;
    }
    public synchronized void unlock(){
        isLocked = false;
        notify();
    }
}

public class Count {
    private Lock lock = new Lock();
    public void print() throws InterruptedException {
        lock.lock();
        doAdd();
        lock.unlock();
    }
    public void doAdd() throws InterruptedException {
        lock.lock();
        //do something
        System.out.println("=========");
        lock.unlock();
    }

    public static void main(String[] args) {
        Count count = new Count();
        try {
            count.print();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
