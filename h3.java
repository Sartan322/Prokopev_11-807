package com.company;

import java.util.Scanner;

public class h3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        String str = sc.next();
        int a = 0;
        char[] ch = str.toCharArray();
        double[] ar = new double[str.length()];
        for (int i = 0; i < str.length() ; i++) {
            double x = ch[i]-48;
            System.out.println(x);
            ar[i]=x * Math.pow (10, str.length()-1-i);
        }
        for (int i = 0; i < str.length() ; i++) {
            a+= (int) ar[i];
        }
        System.out.println(a);

    }
}
