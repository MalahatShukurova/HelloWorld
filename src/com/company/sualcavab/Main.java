package com.company.sualcavab;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        foo(a);
        System.out.println(a);

        User u = new User();
        foo2(u);
        System.out.println(u.a);



    }

    public static void foo(int x) {
        x++;
    }
    public static void foo2(User u){
    u.a++;
    }
}
