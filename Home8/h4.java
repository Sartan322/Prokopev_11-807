package Homework8;
import java.util.Scanner;
public class h4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        int m = sc.nextInt();
        System.out.println("Введите кол-во столбцов");
        int n = sc.nextInt();
        int[][] A = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n ; j++) {
                A[i][j]=sc.nextInt();
            }
        }
        int jBuf = -1;
        int min = 9999;
        boolean prov = true;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                if(A[i][j]<min){
                    min=A[i][j];
                    jBuf=j;
                }
            }
            //System.out.println(min);
            for (int j = 0; j < m && prov ; j++) {
                if(A[j][jBuf]>min){
                    prov=false;
                }
            }
            if(prov==true){
                System.out.print(min);
            }
            min=9999;
            jBuf=-1;
            prov=true;
        }
    }
}
