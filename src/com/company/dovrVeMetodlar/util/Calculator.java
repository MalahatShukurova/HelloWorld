package com.company.dovrVeMetodlar.util;

import java.util.Scanner;

import static com.company.dovrVeMetodlar.util.MathUtil.*;

public class Calculator {
    public static void main(String[] args) {
        calculate();
    }
//        double r = topla(34,4);
//        System.out.println("r="+r);
        public static void calculate() {
            Scanner sc = new Scanner(System.in);
            System.out.println("a-ni daxil edin");
            double a = sc.nextDouble();

            System.out.println("b-ni daxil edin");
            double b = sc.nextDouble();

            System.out.println("emeliyyati daxil edin: + 1, - 2, * 3, / 4");
            int operation = sc.nextInt();

            double result = 0;
            if (operation == 1) {
                result = topla(a, b);
            } else if (operation == 2) {
                result = cix(a, b);
            } else if (operation == 3) {
                result = vur(a, b);
            } else if (operation == 4) {
                result = bol(a, b);
            } else {
                System.out.println("operation is not valid");
            }
            System.out.println("result= " + result);

        }



}

