package com.Cgithub7;
/*
   Author:linrui
   Date:2019/6/7
   Content:
        小易总是感觉饥饿，所以作为章鱼的小易经常出去寻找贝壳吃。
        最开始小易在一个初始位置x_0。
        对于小易所处的当前位置x，他只能通过神秘的力量移动到
        4x + 3或者8x + 7。因为使用神秘力量要耗费太多体力，所以它只能使用神秘力量最多100,000次。
        贝壳总生长在能被1,000,000,007整除的位置(比如：位置0，位置1,000,000,007，位置2,000,000,014等)。
        小易需要你帮忙计算最少需要使用多少次神秘力量就能吃到贝壳。

        思路：4x + 3等于做了两次2x + 1， 8x + 7做了三次2x + 1。
              从起点开始，统计做了多少次2x + 1后模1000000007等于0
*/

import java.util.Scanner;

public class Move {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //初始位置
        int x = scanner.nextInt();
        //保存要走多少个2x+1;
        int count = 0;
        while (x != 0 && count <= 300000) {
            x = ((2 * x) + 1) % 1000000007;
            count++;
        }
        //一共要走从count个2x+1
        int res = (count + 2) / 3;
        if (res > 10000) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }
    }
}
