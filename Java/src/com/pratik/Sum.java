package com.pratik;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner num= new Scanner(System.in);
        System.out.print ("enter the first number: ");
        int a = num.nextInt();
        System.out.print("enter the second number: ");
        int b = num.nextInt();
        int sum = a + b ;
        System.out.println("sum = " + sum);
    }
}
