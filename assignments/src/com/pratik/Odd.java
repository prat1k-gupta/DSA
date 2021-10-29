package com.pratik;

import java.util.Scanner;

public class Odd {

    public static void main(String[] args) {
        System.out.print("enter a number: ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if (a % 2 == 0) {
            System.out.println("number is even!!");
        } else {
            System.out.println("numebr is odd!!");
        }
    }
}
