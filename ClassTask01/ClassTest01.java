package com.company;

import com.company.Classwork250918.A;

import java.util.Arrays;
import java.util.Scanner;

//Вариант 2
public class ClassTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        //Запонили матрицу
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[] Vector = getSideDiagonalAsVector(A);
        System.out.println(Arrays.toString(Vector));
        int[] Vector2 = mult(A, Vector);
        System.out.println(Arrays.toString(Vector2));
        int[] Vector3 = sortArr(Vector2);
        System.out.println(Arrays.toString(Vector3));
        String str = sc.next();
        ClassTestTask2 ct2 = new ClassTestTask2(str);

    }

    public static int[] getSideDiagonalAsVector(int[][] matrix) {
        int[] Vec2 = new int[matrix.length];
        int k = 0;
        for (int i = matrix.length - 1; i > -1; i--) {
            Vec2[k] = matrix[k][i];
            k++;
        }
        return Vec2;
    }

    public static int[] mult(int[][] matrix, int[] arr) {
        int sum = 0;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr2[i] += arr[j] * matrix[i][j];
            }
        }
        return arr2;
    }

    public static int[] sortArr(int[] arr) {
        int[] arrSort = new int[arr.length]; //Создаю массив для суммы цифр
        int[] arr2= new int[arr.length];//Вспомогательный массив чтобы не менять значения в массиве которую передал в процедуру
        for (int i = 0; i < arr.length - 1; i++) {
            arr2[i]=arr[i];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            while (arr2[i] != 0) {
                arrSort[i] += arr2[i] % 10;
                arr2[i] = arr2[i] / 10;
            }
        }
        int max = 0;
        int jBuf = -1; //Запомнить номер элементы с макс суммой цифр
        int c = 0; //Переменная для смены мест 2х чисел
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arrSort[j] > max) {
                    max = arrSort[j];
                    jBuf = j;
                }
            }
            //Меняю сумму элементов местами чтобы заново не натыкаться на этот максимум
            c = arrSort[i];
            arrSort[i] = arrSort[jBuf];
            arrSort[jBuf] = c;
            //Меняю сами элементы
            c = arr[i];
            arr[i] = arr[jBuf];
            arr[jBuf] = c;
        }
        return arr;
    }
}
