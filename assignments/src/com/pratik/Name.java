package com.pratik;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner input = new Scanner(System.in);
        String name= input.next();
        System.out.println("Hey " +name + " have a nice day!");
    }
}
