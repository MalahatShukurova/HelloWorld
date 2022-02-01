package com.company.dovrler;

public class Main {
    public static void main(String[] args) {
        /*
         **********
         **********
         **********
         **********
         **********
         */

//        for(int j = 0; j<5; j++) {
//            for (int i = 0; i < 10; i++) {
//                System.out.print("*");
//            }
//            System.out.println("");
        /*
         *
         **
         ***
         ****
         *****
         ******
         *******

           for(int i=1; i<8; i++){
        for(int j =0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
         */
          /* 3. *
               **
              ***
             ****
            *****
        */
//        for (int i=1;i<8;i++){
//            for (int j=0;j<7-i;j++){
//                System.out.print(" ");
//            }for(int j = 0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");

        /*  4. = = =  = = =
               = = =  = = =
               = = =  = = =
               = = =  = = =

         */
//        for(int j=0;j<4;j++){
//        for(int i=0;i<6;i++){
//            System.out.print("=");
//            if(i!=2){
//                System.out.print(" ");
//            }else {
//                System.out.print("  ");
//            }
//        }
//            System.out.println("");

        for( int i= 0;i< 10; i++){
            if(i==3){
                continue;
            }
            System.out.println(i+ "=");
    }
        System.out.println("for finished");
}}
