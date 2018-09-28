package Homework7;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        int n = 100;
        delit(n, 2);
    }

    public static void delit(int n, int a) {
        if (n % a == 0) {
            System.out.print(a);
            delit(n / a, a);
        } else if (n == 0 || a >= n / 2) {
            return;
        } else if (n % a != 0) {
            delit(n, a + 1);
        }

    }
}
