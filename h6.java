import java.util.Scanner;

public class h6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();

        }
        double c = n/2;
        for (int i = 0; i < c ; i++) {
            int a = 0;
            a = ar[i];
            ar[i] = ar[n-1-i];
            ar[n-1-i] = a;


        }
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i]);
        }

    }
}
