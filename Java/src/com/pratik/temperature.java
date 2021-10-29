package com.pratik;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        System.out.print("enter temperature in degree: ");
        Scanner temp= new Scanner(System.in);
        float far= (temp.nextFloat() * 9/5) + 32;
        System.out.println("temperature in fahrenheit is: " + far + "f");
    }
}
