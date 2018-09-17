package com.company;

import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = sc.next();
        int length = string.length();
        char[] chars = string.toCharArray();
        System.out.println("Введите кол-во символов для сдвига");
        int n = sc.nextInt();
        char[] chars2 = new char[n];
        for (int i = 0; i < n; i++) {
        chars2[i]=chars[length-1-i];
        }
        for (int i = 0; i < length-n ; i++) {
            chars[length-1-i]=chars[length-1-n-i];
        }
        for (int i = 0; i < n ; i++) {
            chars[i]=chars2[n-i-1];
        }
        for (int i = 0; i < length ; i++) {
            System.out.print(chars[i]);
        }



    }
}
