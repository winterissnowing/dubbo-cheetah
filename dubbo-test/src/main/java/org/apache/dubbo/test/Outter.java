package org.apache.dubbo.test;


class Outter {
    int age = 10;
    static int age2 = 20;
    public Outter() {
    }

    static class Inner {
        public void method() {
            //System.out.println(age);//错误
            System.out.println(age2);//正确
        }
    }
}

class Test {
    public static void main(String[] args)  {
        Outter.Inner inner = new Outter.Inner();
        inner.method();
    }
}

