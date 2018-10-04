package com.company.Classwork280918;
import java.util.Scanner;
public class h7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] A= new int[m][m];
        int[] M=new int[m];
        for (int i = 0; i < m ; i++) {
            M[i]=i+1;
        }
        for (int i = 0; i < m ; i++) {
            for (int j = i; j < m ; j++) {
                A[i][j]=M[j-i];
            }
            int k = 0;
            for (int j = i; j > -1 ; j--) {
                A[i][j]=M[k];
                k++;
            }
        }
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(A[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
