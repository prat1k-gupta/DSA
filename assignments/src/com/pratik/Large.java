package com.pratik;

import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        System.out.println("Enter second number: ");
        int b= input.nextInt();
        if (a>b){
            System.out.println("the bigger number is: " + a);
        }
        else {
            System.out.println("the bigger number is: " + b);
        }
    }
}
