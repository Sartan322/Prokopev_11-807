package com.company;

import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int b = arr[i];
            if (b >= 48 && b <= 57) {
                arr[i] = '*';
            }
        }
        str = new String(arr);
        System.out.println(str);
    }

}

