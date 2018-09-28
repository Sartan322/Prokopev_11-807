package Homework7;
import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1234;
        System.out.println(sum(a,0));
    }
    public static int sum(int x, int sum){
        int b = x%10;
        if(x>0){
            sum=sum+b+sum(x/10,0);
        }
        return sum;
    }
}
