package Homework6;

import java.util.Scanner;

public class h1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Введите строки через пробел");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int index = -1;
            for (int j = 0; j < n - i; j++) {
                if (max <= str[j].length()) {
                    max = str[j].length();
                    index = j;
                }
            }
            max = 0;
            String bufStr = str[n-1-i];
            //System.out.println(bufStr);
            str[n-1-i] = str[index];
            //System.out.println(str[i]);
            str[index] = bufStr;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(str[i] + ' ');
        }
    }
}
