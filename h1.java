import java.util.Scanner;

public class h1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sr = 0;
        int v = 0;
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            sr += ar[i]; // sr=sr+ar[i];
        }
        sr = sr / n;
        for (int i = 0; i < n; i++) {
            if (ar[i]>sr){
                v++;

            }

        }
        System.out.println(sr);
        System.out.println(v);

    }
}
