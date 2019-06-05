package com.Cgithub7;
/*
   Author:linrui
   Date:2019/6/3
   Content:
    请设计一个算法完成两个超长正整数的加法。
     输入参数：
     String addend：加数
     String augend：被加数
     返回值：加法结果
*/

import java.math.BigInteger;
import java.util.Scanner;

public class AddLongTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1=scanner.next();
            String str2=scanner.next();
            add(str1,str2);
        }
    }
    public static void add(String str1,String str2){
        BigInteger bigInteger1=new BigInteger(str1);
        BigInteger bigInteger2=new BigInteger(str2);
        BigInteger bigInteger=bigInteger1.add(bigInteger2);
        System.out.println(bigInteger);
    }
}
