package com.pratik;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp=0;
        int num = in.nextInt();
        while(num>0){
            int r= num%10;
            temp = temp*10 + r;
            num= num/10;
        }
        System.out.println(temp);
    }
}
