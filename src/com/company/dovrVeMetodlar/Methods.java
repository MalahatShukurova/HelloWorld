package com.company.dovrVeMetodlar;

public class Methods {
    public static void main(String[] args) {
        String s = foo2();
        System.out.println("s=" + s);

    }

    public static void foo() {
        System.out.println("foo is called");


    }

    public static String foo2() {
        System.out.println("foo2 is called");
        return "ishi gordum";

    }

    public static boolean foo3() {
        System.out.println("foo3 is called");
        return true;


    }
}
