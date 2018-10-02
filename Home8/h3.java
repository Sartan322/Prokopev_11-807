package Homework8;

import java.util.Scanner;

public class h3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во столбцов");
        int m = sc.nextInt();
        System.out.println("Введите кол-во строк");
        int n = sc.nextInt();
        int[][] M = new int[n][m];
        int x = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m - 1 - i; j++) {
                x++;
                M[i][j] = x;
            }
            for (int j = i; j < n - 1 - i; j++) {
                x++;
                M[j][m-1-i]=x;
            }
            for (int j = m-1-i; j > i ; j--) {
                x++;
                M[n-1-i][j]=x;
            }
            for (int j = n-1-i; j > i ; j--) {
                x++;
                M[j][i]=x;
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(M[i][j]);
                System.out.print(' ');
            }
            System.out.println("\n");
        }
    }
}
