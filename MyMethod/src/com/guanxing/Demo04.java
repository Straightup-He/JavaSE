package com.guanxing;

import java.lang.reflect.Array;

//数组遍历
//{11, 22, 33, 44, 55}  --> [11, 22, 33, 44, 55]
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        formatArray(arr);
    }

    public static void formatArray(int[] arr) {

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
