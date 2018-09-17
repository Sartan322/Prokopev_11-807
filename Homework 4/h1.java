
import java.util.Scanner;

public class h1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = {1, 2, 3, 4, 5, 3, 4};
        int ar2[] = {3, 4};
        int l = ar.length;
        int l2 = ar2.length;
        int v = -1;
        for (int i = 0; i < l; i++) {
            if (ar[i] == ar2[0]) {
                v = i;
                int k = 0;
                for (int j = i; j < l && k<l2; j++) {
                    if (ar[j] != ar2[k]) {
                        v = -2;
                        break;
                    }
                    k++;
                }
                if (v != -2) {
                    break;
                }
            }

        }
        System.out.println(v);
    }
}
