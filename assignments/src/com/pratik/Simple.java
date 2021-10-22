package com.pratik;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        System.out.print("Enter Principle: ");
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        System.out.println("Enter Rate: ");
        int r= input.nextInt();
        System.out.println("Enter Time in years : ");
        int t= input.nextInt();
        int result= (p*r*t)/100;
        System.out.println("The simple Interest is: " + result);
    }
}
