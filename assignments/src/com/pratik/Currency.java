package com.pratik;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("Enter the amount in INR: ");
        Scanner input = new Scanner(System.in);
        float inr= input.nextInt();
        float usd= inr * 0.013f;
        System.out.println("The amount in USD is: " + usd);
    }
}

