package com.pratik;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers to be entered: ");
        int n = in.nextInt();
        System.out.println("enter numbers");
        int num=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            num = in.nextInt();
            sum = sum + num ;
        }
        System.out.println("sum is " + sum);
        System.out.println("average is: " + sum/n);
    }
}
