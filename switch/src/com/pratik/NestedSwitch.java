package com.pratik;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Empid = in.nextInt();
        String Department = in.next();
        switch (Empid){
            case 1:
                switch (Department) {
                    case "IT":
                        System.out.println("Name: Pratik Gupta");
                        System.out.println("Department:" + Department);
                        break;
                }
                break;
            case 2:
                switch (Department) {
                    case "Network":
                        System.out.println("Name: Deepak Gupta");
                        System.out.println("Department:" + Department);
                        break;
                }
                break;
            case 3:
                switch (Department) {
                    case "Management":
                        System.out.println("Name: kunal Gupta");
                        System.out.println("Department:" + Department);
                        break;
                    default:
                        System.out.println("No Information found!!");
                }
                break;
            default:
                System.out.println("No information found!!");
        }
    }
}
