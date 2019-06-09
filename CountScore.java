package com.Cgithub7;
/*
   Author:linrui
   Date:2019/6/9
   Content:
        读入N名学生的成绩，将获得某一给定分数的学生人数输出。

        输入描述:
        测试输入包含若干测试用例，每个测试用例的格式为

        第1行：N
        第2行：N名学生的成绩，相邻两数字用一个空格间隔。
        第3行：给定分数

        当读到N=0时输入结束。其中N不超过1000，成绩分数为（包含）0到100之间的一个整数。

        输出描述:
        对每个测试用例，将获得给定分数的学生人数输出。
*/

import java.util.Scanner;

public class CountScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext());
        //保存人数
        int count=scanner.nextInt();
        //如果人数为0,结束
        if(count==0){
            return;
        }
        //保存N个人的成绩
        int [] arr=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=scanner.nextInt();
        }
        //保存要比较的成绩
        int right=scanner.nextInt();
        int sum=0;
        for(int i=0;i<count;i++){
            if(arr[i]==right){
                count++;
            }
        }
        System.out.println(count);
    }
}
