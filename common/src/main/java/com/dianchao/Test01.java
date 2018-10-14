package com.dianchao;

public class Test01 {
    public static void main(String[] args){
        B b = new C();
        test(b);
    }

    public static void test(B b){
        System.out.println("bbb....");
    }

    public static void test(C c){
        System.out.println("ccc....");
    }
}

class B{

}

class C extends B{

}