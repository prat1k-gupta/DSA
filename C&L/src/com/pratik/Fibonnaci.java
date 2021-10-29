package com.pratik;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0, b=1, num=input.nextInt(), n;
        System.out.print(a + " " + b +" ");
        for (int i = 2; i < num; i++) {
            n = a+b;
            System.out.print(n + " ");
            a=b;
            b=n;
        }
    }
}
