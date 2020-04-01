package org.youku.test;

/*
class Point<K, V> {
    private K key;
    private V value;

    public K getKey(){
        return key;
    }

    public void setKey(K key){
        this.key= key;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V value){
        this.value = value;
    }
}

class Info<T> {
    private T var;

    public void setVar(T var){
        this.var = var;
    }

    public T getVar(){
        return var;
    }
}





public class T {
    public static void main(String[] args){
        Point<String, Integer> p1 = new Point<String, Integer>();
        p1.setKey("starbuck");
        p1.setValue(999);
        System.out.println(p1.getKey() + "===" + p1.getValue());
    }

}
*/


class Personer {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        // TODO Auto-generated method stub
        return "name: " + name + ",age: " + age;
    }
}

public class T {
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO Auto-generated method stub
        Class<?> c1 = Class.forName("org.youku.test.Personer");
        Personer personer = null;
        try {
            personer = (Personer) c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        personer.setName("jondon");
        personer.setAge(11);
        System.out.println(personer);
    }
}
