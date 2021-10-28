package com.pratik;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
//        String x = in.next();
//        switch (x) {
//            case "mango" -> System.out.println("Sweet yellow fruit.");
//            case "apple" -> System.out.println("company name.");
//            case "orange" -> System.out.println("also a colour.");
//            default -> System.out.println("invalid input");
        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("MONDAY");
//            case 2 -> System.out.println("TUESDAY");
//            case 3 -> System.out.println("WEDNESDAY");
//            case 4 -> System.out.println("THURSDAY");
//            case 5 -> System.out.println("FRIDAY");
//            case 6 -> System.out.println("SATURDAY");
//            case 7 -> System.out.println("SUNDAY");
//            default -> System.out.println("There are only seven day in a week!! ");
//        }
//        switch(day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("weekdays");
//            case 6:
//            case 7:
//                System.out.println("weekends");
//                break;
//        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekends");
        }
    }
}
