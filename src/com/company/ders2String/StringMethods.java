package com.company.ders2String;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("metni daxil edin");
        String s=sc.nextLine();
        int i = s.length();
        System.out.println("length="+i);

        char c2= s.charAt(s.length()-1);
        System.out.println("last symbol="+c2);

        String substring = s.substring(1,3);
        System.out.println("substring="+substring);

        boolean b= s.contains("Lan");// Java Language
        System.out.println("b(contains)="+b);

        boolean b2 = s.equals("Java Language");
        System.out.println("equals="+b2);

        boolean b22 = s.equalsIgnoreCase("jAva Language");
        System.out.println("equals ignore case="+b22);

        boolean b3= s.isEmpty();
        System.out.println("isEmpty="+b3);

        boolean b4= s.startsWith("Java");
        System.out.println("starts with="+b4);

        boolean b5 = s.endsWith("age");
        System.out.println("ends with="+b5);

        String trim = s.trim();
        System.out.println("trim="+trim);

        String lower = s.toLowerCase();
        System.out.println("lower="+lower);

        String upper = s.toUpperCase();
        System.out.println("upper="+upper);

        int index = s.indexOf("LAN");
        System.out.println("index of LAN="+index);

        int lastIndex = s.lastIndexOf("a");
        System.out.println("lastIndex of A="+lastIndex);

        String replace = s.replace("Java","Hello World");
        System.out.println("replace Java with Hello world="+replace);














    }

}
