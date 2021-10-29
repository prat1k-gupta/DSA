package com.pratik;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        System.out.println("the number entered is " + num);

//        how to enter a whole line
        System.out.println("enter a sentence:");
        String b = inp.next();
        System.out.print(b);

//      how to enter a word
        System.out.println("enter a word:");
        String a= inp.nextLine();
        System.out.println(a);

    }
}
