package com.company.Classwork280918;

import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matr = new int[n][m];
        int maxStr = 0;
        int maxSt = 0;
        int maxBuf = 0;
        int iBufStr = -1;
        int jBufSt = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxBuf += matr[i][j];
            }
            if (maxBuf > maxStr) {
                maxStr = maxBuf;
                iBufStr = i;
            }
            maxBuf = 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxBuf += matr[j][i];
            }
            if (maxBuf > maxSt) {
                maxSt = maxBuf;
                jBufSt = i;
            }
            maxBuf = 0;

        }
        for (int i = 0; i < m ; i++) {
            System.out.print(matr[iBufStr][i]);
            System.out.print(' ');
        }
        System.out.println('\n');
        for (int i = 0; i < n ; i++) {
            System.out.println(matr[i][jBufSt]);
        }
        //System.out.print(maxStr);
        //System.out.print(maxSt);
    }
}
