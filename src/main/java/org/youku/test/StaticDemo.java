package org.youku.test;

enum Color {
    RED("红色"), GREEN("绿色"), BLUE("蓝色");   //传入参数
    private String name;
    private Color(String name){  //定义构造方法
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class StaticDemo {
    /*
    static int cnt = 6;
    static{
        cnt+=9;
    }
    public static void main(String[] args) {
        System.out.println(cnt);
    }
    static{
        cnt/=3;
    }
    public StaticDemo (){
        System.out.println("A的构造函数");
    }
    {
        System.out.println("A的构造代码块");
    }
    static {
        System.out.println("A的静态代码块");
    }
    */

    public static void main(String[] args) {
        //System.out.println("A的Main方法");
        /*
        for(Color c:Color.values()){
            //System.out.println(c);
            //System.out.println(c.name()+"----"+c.ordinal());
            System.out.println(c.ordinal()+"----"+c.name()+"----"+c.getName());
        }
        String str = "hello liuzhaodong";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("第一个o索引位置 :" + str.indexOf("o"));
        System.out.println("最后一个o索引位置" + str.lastIndexOf("o"));
        System.out.println("截取从第6个字符至尾：        " + str.substring(6));
        System.out.println("截取从第6个至第8个字符：" + str.substring(6, 8));

        char charStr[] = str.toCharArray();
        for (int i = 0; i <charStr.length; i++) {
           System.out.print(charStr[i]);
        }
        */
        String str1 = "itmyhome";
        String str2 = "itmyhome";
        System.out.println(str1 == str2);

        System.out.println("abcdef");


    }
}
