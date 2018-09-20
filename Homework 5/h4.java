package com.company;

import java.util.Scanner;

public class h4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.next();
        System.out.println("Введите ключ (l - нижний регистр/u - верхний регистр):");
        String c = sc.next();
        char[] ch = c.toCharArray();
        char[] strChar = str.toCharArray();
        switch (ch[0]) {
            case 117:
                for (int i = 0; i < str.length(); i++) {
                    if (strChar[i] >= 97 && strChar[i] <= 122){
                        int x = strChar[i]-32;
                        strChar[i]= (char) x;
                    }
                }
                break;
            case 108:
                for (int i = 0; i < str.length(); i++) {
                    if (strChar[i] >= 65 && strChar[i] <= 90){
                        int x = strChar[i]+32;
                        strChar[i]= (char) x;
                    }
                }
                break;
        }
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(strChar[i]);
        }
    }
}
