package com.pratik;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
//      input integer and output is float
        System.out.print("enter a number: ");
        Scanner input = new Scanner(System.in);
        float num = input.nextInt();
        System.out.println(num);
//        type casting
        int a = (int) (67.56);
        System.out.println(a);
//       automatic conversion for character to int (ascii value)
        int number = 'a';
        System.out.println(number);
//        final revision
        byte b= 12;
        int i=6;
        float f= 2.4f;
        double d= 23.23423;
        short s= 123;
        double result = (b*i) + (f);
        System.out.println(result);
    }
}
