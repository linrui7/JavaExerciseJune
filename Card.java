package com.Cgithub7;
/*
   Author:linrui
   Date:2019/6/9
   Content:
        我们把这2n张牌分成两堆，
        左手拿着第1张到第n张（上半堆），右手拿着第n+1张到第2n张（下半堆）。
        接着就开始洗牌的过程，先放下右手的最后一张牌，再放下左手的最后一张牌，
        接着放下右手的倒数第二张牌，再放下左手的倒数第二张牌，直到最后放下左手的第一张牌。
        现在给出一个原始牌组，请输出这副牌洗牌k次之后从上往下的序列。
        输入描述:
        第一行一个数T(T ≤ 100)，表示数据组数。
        对于每组数据，第一行两个数n,k(1 ≤ n,k ≤ 100)，接下来一行有2n个数a1,a2,...,a2n(1 ≤ ai ≤ 1000000000)。
        表示原始牌组从上到下的序列。
*/

import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = scanner.nextInt();
        while (group-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int result[] = new int[2 * n];
            //从第一张牌开始遍历
            for (int i = 0; i < 2 * n; i++) {
                //保存当前数进过k次变换的最终下标
                int tmp = i + 1;
                //如果当前下标小于一半，则下一次出现在2tmp-1处
                for (int j = 0; j < k; j++) {
                    if (tmp <= n) {
                        tmp = 2 * tmp - 1;
                        //如果下标大于一半。下次出现在2tmp-2n处
                    } else {
                        tmp = 2 * tmp - 2 * n;
                    }
                }
                //进过k次洗牌后此时的数就是最终的位置
                result[tmp - 1] = scanner.nextInt();
            }
            //输出
            if (result.length > 0) {
                System.out.print(result[0]);
            }
            for (int i = 1; i < 2 * n; i++) {
                System.out.print(" " + result[i]);
            }
            System.out.println();
        }
    }
}