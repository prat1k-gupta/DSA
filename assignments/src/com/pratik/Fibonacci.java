package com.pratik;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner input= new Scanner(System.in);
        int num = input.nextInt();
        int n1=0, n2=1, n3, i;
        System.out.print(n1 + " " + n2);
        for(i=2;i<num;i++){
            n3=n1+n2;
            System.out.print(" "+ n3);
            n1=n2;
            n2=n3;
        }

    }
}
