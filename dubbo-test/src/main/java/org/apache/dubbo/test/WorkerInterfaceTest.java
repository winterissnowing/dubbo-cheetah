package org.apache.dubbo.test;

/*
class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("线程开始：" + this.name + ",i=" + i);
        }
    }
}

class MyThreadS implements Runnable {
    private String name;
    public MyThreadS(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程开始:" + this.name + "i=" +i);
        }
    }
}
*/

class MyThread implements Runnable{
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (this.ticket > 0) {
               System.out.println("线程开始:" +Thread.currentThread().getName()+ "卖票:"+this.ticket--);
            }
        }
    }
}

class MyThread2 extends Thread {
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (this.ticket > 0) {
                System.out.println("线程开始:" +Thread.currentThread().getName()+ "卖票:"+this.ticket--);
            }
        }
    }
}



public class WorkerInterfaceTest {

    public static void runSomeThings(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am  running");
            }
        };
        new Thread(runnable).start();


    }

    public static void main(String [] args) {
        //invoke doSomeWork using Annonymous class
        /*
        execute(new WorkerInterface() {
            @Override
            public void doSomeWork() {
                System.out.println("Worker invoked using Anonymous class");
            }
        });
        */

        //invoke doSomeWork using Lambda expression
        //execute( () -> System.out.println("Worker invoked using Lambda expression") );
        //runSomeThings();
        /*
        MyThread mt1=new MyThread("线程a");
        MyThread mt2=new MyThread("线程b");
        mt1.start();
        mt2.start();
        */
        //mt1.run();
        //mt2.run();
        /*
        MyThreadS mts1 = new MyThreadS("线程a");
        MyThreadS mts2 = new MyThreadS("线程b");
        //new Thread(mt1).start();
        new Thread(mts1).start();
        new Thread(mts2).start();
        */
        MyThread2 mts = new MyThread2();
        new Thread(mts).start();
        new Thread(mts).start();
        new Thread(mts).start();

    }


}
