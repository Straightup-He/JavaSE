package com.guanxing;

public class Demo01 {
    public static void main(String[] args) {
        int max = getMax(10, 20);
        System.out.println("max: "+ max);
    }

    //定义一个方法, 返回两个数的最大值
    public static int getMax(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}
