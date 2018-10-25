package com.dianchao;

public class Test04 {
    public static void main(String[] args) {
        int i = 0;
        //临时变量
        i = i++; //_a = (i++); i = _a;
        System.out.println("i = " + i); //0 为什么是0而不是1

        //return 关键字也有个临时变量
    }

    //返回结果为2
    public static int getResult(){
        //每个方法都会有临时变量_rtnVal
        //只要使用return关键字，就会使用这个临时变量_rtnVal

        //finally
        int i = 0;

        try{
            return i++; //1) _rtnVal = 0; i = 1 2) 是否存下finally子句
        }finally {
            return ++i; //3) _rtnVal = 2; i = 2; 4) return _rtnVal
        }
    }

    //返回结果为0
    public static int getResult2(){
        int i = 0;

        try{
            return i++; //1) _rtnVal = 0; i = 1 2) 是否存下finally子句
        }finally {
            ++i;    //3)  = 2;  4) return _rtnVal
        }
    }
}
