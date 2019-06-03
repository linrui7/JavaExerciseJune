package com.Cgithub7;
/*
   Author:linrui
   Date:2019/6/3
   Content:打印一个由字母组成的正方形
*/

import java.util.Scanner;
/*
aaaaaaaaaa<br/>
a        a<br/>
a        a<br/>
a        a<br/>
aaaaaaaaaa
*/
public class DrowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
           String ch=scanner.next();
           print(n,ch);
        }
    }
    public static void print(int n,String ch){
        if(n<3||n>20){
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print(ch);
        }
        System.out.println();
        for(int i=0;i<(n+1)/2-2;i++){
            System.out.print(ch);
            for(int j=0;j<n-2;j++){
                System.out.print(" ");
            }
            System.out.println(ch);
        }
        for(int i=0;i<n;i++){
            System.out.print(ch);
        }
    }
}
