package com.Cgithub7;
/*
   Author:linrui
   Date:2019/6/4
   Content:
   验证尼科彻斯定理
   即：任何一个整数m的立方都可以写成m个连续奇数之和。
    例如：
    1^3=1
    2^3=3+5
    3^3=7+9+11
    4^3=13+15+17+19
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Nikechesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            nike(m);
        }
    }

    public static void nike(int m) {
        int mmm = m * m * m;
        int x = 0;
        //偶数情况下
        if (m % 2 == 0) {
            x = mmm / m;
            x = x + 1;
            x = x - m;
            for (int i = 0; i < m - 1; i++) {
                System.out.print(x + "+");
                x = x + 2;
            }
            System.out.println(x);
        } else {
            //个数是奇数的情况下
            x = mmm / m;
            x = x - 2 * (m / 2);
            for (int i = 0; i < m - 1; i++) {
                System.out.print(x + "+");
                x = x + 2;
            }
            System.out.println(x);
        }

    }
//连续奇数求和就是等差数列求和，难点立即转换为等差数列的首项，得出首项 a = m*(m-1)+1
    public void code2() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = bf.readLine()) != null) {
            long m = Integer.valueOf(s);
            long a = m * m - m + 1;
            //计算首项
            System.out.print(a);
            for (int i = 1; i < m; i++) {
                //继续等差数列求和
                System.out.print("+" + (a += 2));
            }
            System.out.println();
        }
        bf.close();
    }
}
