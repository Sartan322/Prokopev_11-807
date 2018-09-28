package Homework7;

import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        System.out.println(step(n));
    }
    public static boolean step(double x){
        boolean a = true;
        while(x>1&&a){
            double sr = ((x/2)*10)%10;
            x=x/2;
            if(sr!=0){
                a=false;
            }
        }
        if(a==true){
            return true;
        }
        else{
            return false;
        }
    }
}
