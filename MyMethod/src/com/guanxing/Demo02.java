package com.guanxing;

//测试基本类型参数传递
public class Demo02 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前: "+number);
        change(number);
        System.out.println("调用change方法后: "+number);
    }

    public static void change(int number) {
        number = 200;
    }
}
/*
调用前: 100
调用后: 100
ps:对于基本类型的参数, 形参的改变不会影响到实参
 */