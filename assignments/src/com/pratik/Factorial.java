package com.pratik;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = in.nextInt();
        int temp =num;
        for (int i = 2; i < temp ; i++) {
             num =num*i;
        }
        System.out.println(num);
    }
}
