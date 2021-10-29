package com.pratik;

public class Loops {
    public static void main(String[] args) {
        /*
        Syntax for for loop:
        for ( intialization; condition; increment){
        }
        print number 1-5
         */
        for (int num = 1; num <= 5; num++) {
            System.out.print(num+ " ");

        }
        System.out.println(" ");

        /*
        Syntax for while loop
        while(conditon){
                }
        print number 1-5
                */
        int i=1;
        while (i<=5){
            System.out.print(i+ " ");
            i++;
        }
        /*
        When to use For and While ?
        For : when you know the number of times the loop is gonna run use For.
        While: when you don't know how many times the loop is gonna run use While.
         */

    }
}
