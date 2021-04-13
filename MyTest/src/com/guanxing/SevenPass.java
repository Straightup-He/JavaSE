package com.guanxing;

//逢七过 1-100 数字带有7或者能被7整除
public class SevenPass {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 100; i++) {
            //个位数是7 十位数是7 能被7整除
            if (i % 10 == 7 || i / 10 == 7 || i % 7 == 0) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("总共有" + count + "个");
    }
}
