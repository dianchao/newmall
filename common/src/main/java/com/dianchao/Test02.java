package com.dianchao;

public class Test02 {
    public static void main(String[] args) {
        //动态绑定机制（只针对成员方法，和属性没有关系）
        //当程序运行时，调用了对象的成员方法，那么JVM会将方法和当前对象的实际内存进行绑定，然后调用
        BB b = new CC();
        System.out.println(b.getSum());
    }
}

class BB{
    public int i = 10;

    public int getI(){
        return i;
    }

    public int getSum(){
        return getI() + 10;
    }
}

class CC extends BB{
    public int  i = 20;

//    public int getSum(){
//        return i + 20;
//    }

    public int getI(){
        return i;
    }
}
