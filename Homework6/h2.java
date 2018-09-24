package Homework6;

import java.util.Scanner;

public class h2 {
    public static String space(String x) {
        char[] ch = x.toCharArray();
        int v = -1;
        for (int i = 0; i < x.length()&&v==-1 ; i++) {
            if(ch[i]!=' '){
                v=i;
            }
        }
        char[] ch2 = new char[x.length()-v];
        for (int i = 0; i < x.length()-v ; i++) {
            ch2[i]=ch[i+v];
        }
        x= String.valueOf(ch2);
        return  x;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        System.out.println(space(str));

    }


}
