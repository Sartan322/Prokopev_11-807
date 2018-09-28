package Homework7;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(prost(a, a - 1));
    }

    public static boolean prost(int a, int b) {
        if (b > 1 && a % b != 0) {
            prost(a, b - 1);
            return true;
    }
        else{
            return false;
        }
    }
}
