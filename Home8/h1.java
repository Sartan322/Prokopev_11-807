package com.company.Classwork280918;

import java.util.Scanner;

public class h1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matr = new int[n][n];
        boolean prov = true;
        int sum = 0;
        int sumBuf = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n && prov; i++) {
            sum += matr[i][i];
        }
        System.out.println(sum);
        for (int i = n - 1; i >= 0; i--) {
            sumBuf += matr[i][i];
        }
        if (sum != sumBuf) {
            prov = false;
        }
        sumBuf = 0;
        for (int i = 0; i < n && prov; i++) {
            for (int j = 0; j < n; j++) {
                sumBuf += matr[i][j];
            }
            if (sum != sumBuf) {
                prov = false;
            }
            sumBuf = 0;
            for (int j = 0; j < n; j++) {
                sumBuf+=matr[j][j];
            }
            if (sum != sumBuf) {
                prov = false;
            }
            sumBuf = 0;
        }
        System.out.println(prov);


    }
}
