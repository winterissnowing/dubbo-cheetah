package org.apache.dubbo.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

    public static void main(String[] args){
        //测试一下currentHashMap.putIfAbsent()

        Map<Long, String> clientMap = new ConcurrentHashMap<>();

        System.out.println("在空的clientMap中添加一个新的记录");
        System.out.println("添加之前的clientMap:" + clientMap);
        Long id = 1234567L;
        String name = "jordon";
        String ret = clientMap.putIfAbsent(id, name);
        System.out.println("添加之后的clientMap:" + clientMap);
        System.out.println("查看反馈值result:" + ret);

        System.out.println("重复添加上一次的记录");
        System.out.println("添加之前的clientMap:" + clientMap);
        String ret2 = clientMap.putIfAbsent(id, name);
        System.out.println("添加之后的clientMap:" + clientMap);
        System.out.println("查看反馈值ret2:" + ret2);


    }
}
