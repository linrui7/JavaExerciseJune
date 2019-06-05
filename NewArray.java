package com.Bgithub7;
/*
   Author:linrui
   Date:2019/6/5
   Content:
       给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
       其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。

        B[0] = A[1] * A[2] * A[3] * A[4] *....*A[n-1] ;（没有A[0]）
        B[1 ]= A[0] * A[2] * A[3] * A[4] *....*A[n-1] ;（没有A[1]）
        B[2] = A[0] * A[1] * A[3] * A[4] *....*A[n-1] ;（没有A[2]）
*/

import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        multiply(arr);
    }

    public static int[] multiply(int[] A) {
        int[] B=new int[A.length];
        for(int i=0;i<B.length;i++){
            B[i]=1;
            //B[i]= A[1]连乘到A[length]  但是i==k时，A[j]==1就行了 乘完之后给它重新赋为原来的值
            for(int j=0;i<A.length;j++){
                int tmp=A[j];
                if(i==j){
                    A[j]=1;
                }
                B[i]=B[i]*A[j];
                A[i]=tmp;
            }
        }
        return B;
    }
}
