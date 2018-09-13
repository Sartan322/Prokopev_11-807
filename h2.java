import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int max = 0;
        int j = -1;
        for (int i = 0; i < n ; i++) {
            ar[i] = sc.nextInt();
            if(Math.abs(ar[i])>max){
                max = Math.abs(ar[i]);
                j=i;
            }

        }
        System.out.println(j);

    }
}
