package Homework6;
import java.util.Scanner;

public class h3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 5, 5, 8, 5, 7, 11};
        int max = 0;
        int sch = 0;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i-1]==arr[i]) {
                sch++;
                if (max <= sch) {
                    max = sch;
                }
            }
            else {
                sch=0;
            }

        }
        System.out.println(max+1);
    }
}
