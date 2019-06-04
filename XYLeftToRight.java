package com.Bgithub7;
/*
   Author:linrui
   Date:2019/5/30
   Content:
       有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，
       要从左上角走到右下角。请设计一个算法， 计算机器人有多少种走法。
       给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。
   解题思路
        机器人在X*Y的矩阵中走，每一步都有两种选择：要么向下、要么向右。
        如果向下走，问题就变成：求(X1)*Y矩阵中机器人的走法；
        如果向右走，问题就变成：求X*(Y-1)矩阵中机器人的走法；
        显然是递归的思 想！ 既然是递归，再考虑退出条件：
        当整个矩阵只有一行 或 一列的时候只有一种走法。

*/

import java.util.Scanner;

public class XYLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while(scanner.hasNext()){
           int x = scanner.nextInt();
           int y = scanner.nextInt();
           int z = count(x, y);
           System.out.println(z);
       }
    }

    public static int count(int x, int y) {
        if (x == 1 || y == 1) {
            return 1;
        }
        return count(x - 1, y) + count(x, y - 1);
    }
}
