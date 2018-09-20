import java.util.Scanner;
public class h3  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = "Digits:";
        for(int i=1;i<n-1;i++){
            int c = sc.nextInt();
            if(b>a&&b>c){
                str = str + b + " ";

            }
            a=b;
            b=c;
        }
        System.out.print(str);
    }
} 