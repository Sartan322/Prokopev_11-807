package com.company;

import java.util.Scanner;

public class h3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = sc.next();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char[] chars = string.toCharArray();
        char[] charsResult = new char[string.length() - 1];
        int k = 0;
        for (int i = 0; i < n1; i++) {
            charsResult[i]=chars[i];
            k++;
        }
        for (int i = n2-1; i <string.length() ; i++) {
            charsResult[k]=chars[i];
        }
        String strResult = String.valueOf(charsResult);
        System.out.println(strResult);



    }
}
