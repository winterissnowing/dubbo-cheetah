package org.apache.dubbo.test;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// declare a new annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Demo {

    String str();

    int val();
}

public class PackageDemo {

    // set values for the annotation
    @Demo(str = "Demo Annotation", val = 100)
    // a method to call in the main
    public static void example() {
        PackageDemo ob = new PackageDemo();

        try {
            Class c = ob.getClass();

            System.out.println("className: " + c.toString());

            // get the method example
            Method m = c.getMethod("example");

            System.out.println("MethodName:" + m.toString());

            // get the annotation for class Demo
            Demo annotation = m.getAnnotation(Demo.class);

            System.out.println(annotation.str()+"===="+annotation.val());

            // print the annotation
            System.out.println(annotation.str() + " " + annotation.val());
        } catch (NoSuchMethodException exc) {
            exc.printStackTrace();
        }
    }

    public static void main(String args[]) {
        example();
    }
}

