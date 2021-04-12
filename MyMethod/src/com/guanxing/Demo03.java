package com.guanxing;

//测试引用类型参数传递
public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int index = 1;
        System.out.println("调用change方法前: "+arr[index]);
        change(arr, index);
        System.out.println("调用change方法后: "+arr[index]);
    }

    public static void change(int[] arr, int index) {
        arr[index] = 100;
    }
}
/*
调用change方法前: 20
调用change方法后: 100
ps:对于引用类型的参数, 形参的改动会影响实参
 */
