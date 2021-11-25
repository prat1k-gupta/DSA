package com.pratik;

import java.util.Scanner;

public class Circlearea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = in.nextDouble();
        double result = 3.14 * r * r;
        System.out.println(result);
    }
}
