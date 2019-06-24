package com.Dgithub7;
/*
   Author:linrui
   Date:2019/6/18
   Content:
对消息原文中的每个字母，分别用该字母之后的第5个字母替换
（例如：消息原文中的每个字母A 都分别替换成字母F），其他字符不 变，
并且消息原文的所有字母都是大写的。密码中的字母与原文中的字母对应关系如下。
密码字母：A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
原文字母：V W X Y Z A B C D E F G H I J K L M N O P Q R S T U


输入描述:
输入包括多组数据，每组数据一行，为收到的密文。
密文仅有空格和大写字母组成。

输出描述:
对应每一组数据，输出解密后的明文。
*/

import java.util.Scanner;

public class Passwd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            newstr(str);
        }
    }

    public static void newstr(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char ch1 = ch[i];
            if (ch1 >= 'A') {
                if (ch1 > 'E') {
                    ch1 -= 5;
                } else {
                    ch1 += 21;
                }
                ch[i] = ch1;
            }
        }
        //替换完之后打印输出char；
        System.out.println(new String(ch));
    }
}
