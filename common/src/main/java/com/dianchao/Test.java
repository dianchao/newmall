package com.dianchao;

public class Test {
    public static void main(String[] args) throws Exception{
        A a = new A();
        a.clone();
    }
}

class A{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
