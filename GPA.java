package com.Egithub7;
/*
   Author:linrui
   Date:2019/6/30
   Content:
        北京大学对本科生的成绩施行平均学分绩点制（GPA）。既将学生的实际考分根据不同的学科的不同学分按一定的公式进行计算。
        公式如下：
        实际成绩 绩点
        90——100 4.0
        85——89 3.7
        82——84 3.3
        78——81 3.0
        75——77 2.7
        72——74 2.3
        68——71 2.0
        64——67 1.5
        60——63 1.0
        60以下 0
        1．一门课程的学分绩点=该课绩点*该课学分
        2．总评绩点=所有学科绩点之和/所有课程学分之和
        现要求你编写程序求出某人A的总评绩点（GPA）。
*/

import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int len = scanner.nextInt();
            int[] score = new int[len];
            for (int i = 0; i < len; i++) {
                score[i] = scanner.nextInt();
            }
            double[] sco = new double[len];
            for (int i = 0; i < len; i++) {
                sco[i] = (double) scanner.nextInt();
            }
            print(len, score, sco);
        }
    }

    public static void print(int n, int[] arr1, double[] arr2) {
        double sco[] = new double[n];
        double all=0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr2[i] > 90) {
                arr2[i] = 4.0;
            } else if (arr2[i] >= 85) {
                arr2[i] = 3.7;
            } else if (arr2[i] >= 82) {
                arr2[i] = 3.3;
            } else if (arr2[i] >= 78) {
                arr2[i] = 3.0;
            } else if (arr2[i] >= 75) {
                arr2[i] = 2.7;
            } else if (arr2[i] >= 72) {
                arr2[i] = 2.3;
            } else if (arr2[i] >= 68) {
                arr2[i] = 2.0;
            } else if (arr2[i] >= 64) {
                arr2[i] = 1.5;
            } else if (arr2[i] >= 60) {
                arr2[i] = 1.0;
            } else {
                arr2[i] = 0;
            }
            sco[i] = arr1[i] * arr2[i];
            sum += sco[i];
        }

        for(int i=0;i<n;i++){
            all+=arr1[i];
        }
        sum=sum/all;
        System.out.println(String.format("%.2f",sum));
    }
}
