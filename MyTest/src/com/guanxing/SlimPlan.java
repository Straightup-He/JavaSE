package com.guanxing;

import java.util.Scanner;

//循环相关的练习
public class SlimPlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("请输入星期数(输入-1结束): ");
            int day = scanner.nextInt();
            if ((day < 1 && day != -1) || day > 7) {
                System.out.println("你输入的星期数有误!");
            } else if (day == 1) {
                System.out.println("跑步");
            } else if (day == 2) {
                System.out.println("游泳");
            } else if (day == 3) {
                System.out.println("登山");
            } else if (day == 4) {
                System.out.println("篮球");
            } else if (day == 5) {
                System.out.println("拳击");
            } else if (day == 6) {
                System.out.println("羽毛球");
            } else if (day == 7) {
                System.out.println("吃顿大餐!");
            } else {
                System.out.println("退出程序...");
                break;
            }
        }
    }
}
