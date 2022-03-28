package com.company.dovrVeMetodlar;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        String b = foo2("Salam");
        System.out.println("b=" + b);

    }

    public static void foo(String s) {
        System.out.println("foo=" + s);


    }

    public static String foo2(String s) {
        System.out.println("foo2=" + s);
        return "ishi gordum";

    }

    public static boolean foo3(String s) {
        System.out.println("foo3=" + s);
        return true;


    }

    public static void foo() {
    }

    public static double calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        double a = sc.nextDouble();

        System.out.println("b-ni daxil edin");
        double b = sc.nextDouble();

        System.out.println("emeliyyati daxil edin +1 -2 *3 /4 ");
        int operation = sc.nextInt(); //

        double result = 0;

        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("case 1");
                break;
            case 2:
                result = a - b;
                System.out.println("case 2");
                break;
            case 3:
                result = a*b;
                System.out.println("case 3");
                break;
            case 4:
                result = a/b;
                System.out.println("case 4");
                break;
            default:
                result = -1;
                System.out.println("default");
        } return result;



    }


}
