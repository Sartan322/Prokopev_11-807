package com.company;

public class ClassTestTask2 {
    ClassTestTask2(String str){
        char[] chars = str.toCharArray();
        int x = chars[0]-48;
        for (int i = 2; i < chars.length ; i=i+2) {
            if(chars[i-1]=='+'){
                x=x+(chars[i]-48);
            }
            else {
                x=x-(chars[i]-48);
            }
        }
        System.out.println(x);
    }
}
