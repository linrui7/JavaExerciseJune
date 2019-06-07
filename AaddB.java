package com.Cgithub7;
/*
   Author:linrui
   Date:2019/6/5
   Content:
   实现两个数的相加求和，实现过程中不能用+运算符号
*/

import java.math.BigInteger;
import java.util.Scanner;

public class AaddB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            addAB(A, B);
        }
    }

    //方法一转换为长int型
    public static int addAB(int A, int B) {
        BigInteger bigIntegerA = new BigInteger(String.valueOf(A));
        BigInteger bigIntegerB = new BigInteger(String.valueOf(B));
        BigInteger bigInteger = bigIntegerA.add(bigIntegerB);
        int x = bigInteger.intValue();
        System.out.println(x);
        return x;
    }
    //方法二
    // 位的异或运算跟求'和'的结果一致
    // 位的与运算跟求'进位‘的结果一致
    public static int addAB2(int A, int B) {
        if(B==0){
            return A;
        }
        //相加
        int sum=A^B;
        //进位不加
        int jinwei=(A&B)<<1;
        return addAB2(sum,jinwei);
    }
}
