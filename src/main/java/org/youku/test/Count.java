package org.youku.test;



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

    public void main() throws InterruptedException {
        Lock lock = new Lock();
        lock.lock();
        //doAdd();
        lock.unlock();
    }

}
