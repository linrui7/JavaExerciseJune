package com.Cgithub7;
/*
   Author:linrui
   Date:2019/6/4
   Content:
        给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。
        目标是使得最后得到的数尽可能小（注意0不能做首位）。
        例如：给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。
        0 1 2 3 4 5 6 7 8 9
        输入每个数字出现的次数
        2 2 0 0 0 3 0 0 1 0
        输出
        100155582
*/

import java.util.Scanner;

public class SmallNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //创建数组保存0-9出现的次数
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }
        //首先输出1-9中最小的一个数
        for (int i = 1; i < 10; i++) {
            if (num[i] != 0) {
                System.out.print(i);
                num[i]--;
                break;
            }
        }
        //接下来输出0
        while (num[0]!=0){
            System.out.print(0);
            num[0]--;
        }
        //最后依次输出1-9的
        for(int i=1;i<10;i++){
            while (num[i]!=0){
                System.out.print(i);
                num[i]--;
            }
        }
    }
}
