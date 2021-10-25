package com.pratik;

public class Condition {

    public static void main(String[] args) {
        /*
        Syntax for if statement:
        if (condition){
                    }
        else{
        }
         */
        int sallary = 10000;
        if (sallary>1000){
            sallary=sallary+1000;
            System.out.println(sallary);
        }
        else if (sallary>20000){
            System.out.println("nothing");
        }
        else{
            System.out.println("no increment in sallary");
        }
    }
}
