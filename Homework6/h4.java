package Homework6;

import java.util.Scanner;

public class h4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 4, 5, 6};
        System.out.println(unik(arr));

    }

    static boolean unik(int[] arr) {
        boolean a = true;
        for (int i = 0; i < arr.length && a; i++) {
            for (int j = i+1; j < arr.length && a; j++) {
                if (arr[i] == arr[j]) {
                    a = false;
                }
            }
        }
        if (a){
            return a;
        }
        else {
            return false;
        }

    }
}
