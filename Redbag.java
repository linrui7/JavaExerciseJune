package com.Dgithub7;
/*
   Author:linrui
   Date:2019/6/15
   Content:
   春节期间小明使用微信收到很多个红包，非常开心。
   在查看领取红包记录时发现，
   某个红包金额出现的次数超过了红包总数的一半。
   请帮小明找到该红包金额。
   写出具体算法思路和代码实现，要求算法尽可能高效
*/

import java.util.Arrays;

public class Redbag {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 2};
        int n = 5;
        System.out.print(getValue2(a, n));
    }

    int getValue1(int[] gifts, int n) {
        Arrays.sort(gifts);//数组排序，采用Arrays的sort方法
        int ans = gifts[n / 2];//理论上超过半数的数字
        int num = 0;      //遍历数组，进行统计
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] == ans) {
                num++;
            }
        }
        return num <= n / 2 ? 0 : ans;
    }

    public static int getValue2(int[] gifts, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < gifts.length; i++) {
            arr[gifts[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n / 2) {
                return i;
            }
        }
        return 0;
    }
}
