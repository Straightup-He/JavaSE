package com.guanxing;

import java.util.Scanner;

// 斐波那契数列
// 1, 1, 2, 3, 5, 8......
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请输入你想知道斐波那契数列的第几个数: ");

            int number = scanner.nextInt();
            System.out.println(getFibonacci(number));
        }
    }

    public static int getFibonacci(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int c;
            while (number > 1) {
                c = a;
                a = b;
                b = c + b;
                number--;
            }
            return b;
        }
    }
}

