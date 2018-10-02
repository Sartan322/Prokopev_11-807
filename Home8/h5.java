package Homework8;

import java.util.Scanner;

public class h5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = {{-7, 5},
                    {2, -1},
                    {4, 3}};
        int[][] B = {{2, -3, 1},
                     {5, 4, -2}};
        int m = A.length;
        int v = A[0].length;
        int n = B[0].length;
        int[][] C = new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j <n ; j++) {
                for (int k = 0; k < v ; k++) {
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(C[i][j]);
                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}
