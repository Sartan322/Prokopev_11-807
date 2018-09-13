import java.util.Scanner;

public class h4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int v = 0;
        ar[0]=sc.nextInt();
        for (int i = 1; i < n ; i++) {
            ar[i]=sc.nextInt();
            if (ar[i]<ar[i-1]&&i<(n+1)/2||ar[i]>ar[i-1]&&i>(n+1)/2) {
                v=-1;
                break;
            }
            }
            if(v==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }


        }

    }
