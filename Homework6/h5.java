package Homework6;

import java.util.Scanner;

public class h5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во элементов 1 массива");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Введите элементы массива через пробел");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Введите кол-во элементов 2 массива");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Введите элементы массива через пробел");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int k = 0;
        boolean a = true;
        for (int i = 0; i < n1; i++) {
            for (int j = i + 1; j < n1; j++) {
                if (arr1[i] == arr1[j]) {
                    a = false;
                }
            }
            if (a) {
                for (int j = 0; j < n2; j++) {
                    for (int l = j + 1; l < n2; l++) {
                        if (arr2[j] == arr2[l])
                            a = false;
                    }
                    if(arr1[i]==arr2[j]){
                        k++;
                    }
                }
            }
        }
        System.out.println(k);

    }
}
