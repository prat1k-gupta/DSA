package com.pratik;

import java.util.Scanner;

public class Inputnum {
    //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num = 1;
        while(num!=0){
            num  = in.nextInt();
            sum = sum + num;
        }
        System.out.print(" sum of numbers entered is : " + sum );
    }
}
