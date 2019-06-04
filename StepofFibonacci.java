package com.Bgithub7;
/*
   Author:linrui
   Date:2019/6/4
   Content:
        Fibonacci数列是这样定义的：
        F[0] = 0
        F[1] = 1
        for each i ≥ 2: F[i] = F[i-1] + F[i-2]
        因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，
        在Fibonacci数列中的数我们称为Fibonacci数。给你一 个N，你想让其变为一个Fibonacci数，
        每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少 需要多少步可以变为Fibonacci数。
    解题思路
        以我们可以只用三个变量 a b c分别表示每次迭代中的 A[n] A[n-1] A[n-2]
        计算数列的过程中，如果发现某一项大于等于n，则迭代就可以停止了。
        此时n的值介于最后的 两项之间。这时候只要找到n和这两项距离最小者即可
*/

import java.util.Scanner;

public class StepofFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            count(x);
        }
    }

    public static void count(int x) {
        int a=0;
        int b=1;
        int c=1;
        //找出大于x和小于x 的临界值
        while(c<x){
            a=b;
            b=c;
            c=a+b;
        }
        int frount=x-b;
        int next=c-x;
        int n= frount>next? next:frount;
        System.out.println(n);
    }
}
