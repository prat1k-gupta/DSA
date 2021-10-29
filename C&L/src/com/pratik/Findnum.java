package com.pratik;

import java.util.Scanner;

public class Findnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("enter number to find the number of times it happened: ");
        int a = in.nextInt();
        int count = 0;
        while (num > 0) {
            int r = num % 10;
            if (r == a) {
                count = count + 1;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
