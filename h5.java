import java.util.Scanner;

public class h5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = {3, 4, 2, 11, 133};
        int n = ar.length;
        int y = 0;
        double x = ar[n - 1];
        int x1 = ar[n - 1];
        while (x1 > 0) {
            x1 = x1 / 10;
            y++;
        }
        for (int i = n - 2; i >= 0; i--) {
            int b = ar[i];
            x = x + b * Math.pow(10, y);
            while (ar[i] > 0) {
                y++;
                ar[i] = ar[i] / 10;
                System.out.println(x);
            }

            System.out.println(x);


        }
        x1 = (int) x;
        System.out.println(x1);


    }
}
