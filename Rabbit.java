package com.Dgithub7;
/*
   Author:linrui
   Date:2019/6/18
   Content:
   有一只兔子，从出生后第3个月起每个月都生一只兔子，
   小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死
   问每个月的兔子总数为多少？
*/

import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int count=in.nextInt();
            System.out.println(getTotalCount(count));
        }
    }
    public static int getTotalCount(int mounthCount){
        int firMon=1;
        int secMon=1;
        int resMon=1;
        //如果月份数大于2  那么就一直加
        //当前月的个数是
        while (mounthCount>2){
            //当前月个数
            resMon=firMon+secMon;
            //第一个月个数
            firMon=secMon;
            //第二个月个数
            secMon=resMon;

            mounthCount--;
        }
        return resMon;
    }
}
